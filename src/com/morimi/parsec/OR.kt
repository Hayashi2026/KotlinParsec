package com.morimi.parsec

class OR(private val parser1: Parser, private val parser2: Parser): Parser {

    override fun parse(target: String): Result {
        val result = parser1.parse(target)
        if (result.succeeded) {
            return result
        }
        return parser2.parse(target)
    }
}