package com.morimi.parsec

class Try(val parser: Parser): Parser {

    override fun parse(target: String): Result {
        try {
            return parser.parse(target)
        } catch (exception: ParserException) {
            throw ParserException("Try parse $target by $parser failed")
        }
    }
}