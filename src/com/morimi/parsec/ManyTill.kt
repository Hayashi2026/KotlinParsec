package com.morimi.parsec

class ManyTill(private val parser: Parser, private val end: Parser): Parser {

    override fun parse(target: String): Result {
        var tempTarget = target
        var result = Result("", "", true)
        while (true) {
            val endResult = end.parse(tempTarget)
            if (endResult.succeeded) return Result.concat(result, endResult)
            val nextResult = parser.parse(tempTarget)
            if (!nextResult.succeeded) {
                return Result.fail()
            }
            tempTarget = nextResult.remain
            result = Result.concat(result, nextResult)
        }
    }
}