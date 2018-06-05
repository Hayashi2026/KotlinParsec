package com.morimi.parsec

class ManyTill(private val parser: Parser, private val end: Parser): Parser {

    override fun parse(target: String): Result {
        var pre = Result.success("", "")
        var parsing = target
        while (true) {
            try {
                return Result.concat(pre, end.parse(parsing))
            } catch (exception: ParserException) {
                val result = parser.parse(parsing)
                pre = Result.concat(pre, result)
                parsing = result.remain
            }
        }
    }
}