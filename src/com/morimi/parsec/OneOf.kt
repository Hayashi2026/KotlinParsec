package com.morimi.parsec

class OneOf(private vararg val parsers: Parser): Parser {

    override fun parse(target: String): Result {
        for (parser in parsers) {
            try {
                return parser.parse(target)
            } catch (e: ParserException) {
                //do nothing
                println("throw exception while $parser parse ${target.substring(0, if (target.length > 30) 30 else target.length)}")
            }

        }
        throw ParserException("none of the parsers can parse $target")
    }

    override fun toString(): String {
        return this.javaClass.simpleName
    }
}