package com.morimi.parsec

class OneOf(private vararg val parsers: Parser): Parser {

    override fun parse(target: String): Result {
        for (parser in parsers) {
            val result = parser.parse(target)
            if (result.succeeded) {
                return result
            }
        }
        return Result.fail()
    }
}