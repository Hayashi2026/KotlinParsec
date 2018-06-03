package com.morimi.parsec

class SEQ(private val parser1: Parser, private val parser2: Parser): Parser {

    override fun parse(target: String): Result {
        val result1 = parser1.parse(target)
        if (result1.succeeded) {
            val result2 = parser2.parse(result1.remain)
            if (result2.succeeded) {
                return Result.concat(result1, result2)
            }
        }
        return Result.fail()
    }
}