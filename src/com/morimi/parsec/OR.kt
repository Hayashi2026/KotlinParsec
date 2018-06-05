package com.morimi.parsec

class OR(private val parser1: Parser, private val parser2: Parser): Parser {

    override fun parse(target: String): Result {
        try {
            return parser1.parse(target)
        } catch (exception: ParserException) {
            //do nothing
        }
        try {
            return parser2.parse(target)
        } catch (exception: ParserException) {
            //do nothing
        }
        throw ParserException("Except $target can be parsed by $parser1 or $parser2")
    }
}