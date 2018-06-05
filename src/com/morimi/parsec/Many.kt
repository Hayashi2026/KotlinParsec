package com.morimi.parsec

class Many(val parser: Parser): Parser {

    override fun parse(target: String): Result {
        var pre = Result.success("", "")
        var parsing = target
        while (true) {
            try {
                val result = parser.parse(parsing)
                pre = Result.concat(pre, result)
                parsing = result.remain
            } catch (exception: ParserException) {
                return pre
            }
        }
    }
}