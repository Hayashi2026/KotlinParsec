package com.morimi.parsec

class Newline: Parser {

    private val parser = OR(Lf(), Crlf())

    override fun parse(target: String): Result {
        val result = parser.parse(target)
        if (result.succeeded) {
            return Return("\r\n").parse(result.remain)
        }
        return Result.fail()
    }
}