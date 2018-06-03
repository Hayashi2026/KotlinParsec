package com.morimi.parsec

class Crlf: Parser {

    val parser = Text("\r\n")

    override fun parse(target: String): Result {
        return parser.parse(target)
    }
}