package com.morimi.parsec

class Newline: Parser {

    private val parser = OR(Lf(), Crlf())

    override fun parse(target: String): Result {
        try {
            val result = parser.parse(target)
            return Return("\r\n").parse(result.remain)
        } catch (exception: ParserException) {
            throw ParserException("Lf() OR Crlf() parser failed")
        }
    }
}