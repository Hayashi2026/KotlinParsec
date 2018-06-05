package com.morimi.parsec

class OneOf(private vararg val parsers: Parser): Parser {

    override fun parse(target: String): Result {
        for (parser in parsers) {
            try {
                return parser.parse(target)
            } catch (e: ParserException) {
                //do nothing

            }

        }
        throw ParserException("none of the parsers can parse $target")
    }
}