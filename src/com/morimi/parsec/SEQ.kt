package com.morimi.parsec

class SEQ(private val parser1: Parser, private val parser2: Parser): Parser {

    override fun parse(target: String): Result {
        val result1 = parser1.parse(target)
        val result2 = parser2.parse(result1.remain)
        return Result.concat(result1, result2)
    }
}