package com.morimi.parsec

class EndOfLine: Parser {

    private val parser = OR(Text("\n\r"), Ch('\n'))

    override fun parse(target: String): Result {
        return parser.parse(target)
    }
}