package com.morimi.parsec

class NoneOf(private vararg val parsers: Parser): Parser {

    override fun parse(target: String): Result {
        var result: Result? = null
        var lastParser: Parser?  = null
        for (parser in parsers) {
            try {
                result = parser.parse(target)
                lastParser = parser
                break
            } catch (e: ParserException) {
                //do nothing
                println("throw exception while $parser parse ${target.substring(0, if (target.length > 30) 30 else target.length)}")
            }
        }
        result?.let {
            throw ParserException("Expect none of $parsers but is parsed by $lastParser")
        }
        return Result.success("", target)
    }

    override fun toString(): String {
        return this.javaClass.simpleName
    }
}