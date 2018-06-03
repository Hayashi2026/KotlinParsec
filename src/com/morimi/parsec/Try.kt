package com.morimi.parsec

class Try(val parser: Parser): Parser {

    override fun parse(target: String): Result {
        val result = parser.parse(target)
        if (result.succeeded) {
            return result
        }
        return Result.fail()
    }
}