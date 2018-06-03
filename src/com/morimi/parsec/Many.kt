package com.morimi.parsec

class Many(val parser: Parser): Parser {

    override fun parse(target: String): Result {
        var tempTarget = target
        var result = Result("", "", true)
        while (true) {
            val nextResult = parser.parse(tempTarget)
            if (!nextResult.succeeded) {
                break
            }
            tempTarget = nextResult.remain
            result = Result.concat(result, nextResult)
        }
        return result
    }
}