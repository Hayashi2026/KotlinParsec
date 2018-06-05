package com.morimi.parsec

class OneOrMany(private val parser: Parser) : Parser {

    override fun parse(target: String): Result {
        var pre = parser.parse(target)
        while (true) {
            try {
                val result = parser.parse(pre.remain)
                pre = Result.concat(pre, result)
            } catch (e: ParserException) {
                return pre
            }
        }
    }

}