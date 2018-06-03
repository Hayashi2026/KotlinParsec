package com.morimi.parsec

class OneOrMany(private val max: Int, private val parser: Parser): Parser {

    override fun parse(target: String): Result {
        val result = parser.parse(target)
        if (result.succeeded) {
            return parse(result, 1)
        }
        return Result.fail()
    }

    private fun parse(pre: Result, count: Int): Result {
        if (count >= max) {
            return pre
        }
        val result = parser.parse(pre.remain)
        if (result.succeeded) {
            return parse(Result.concat(pre, result), count + 1)
        }
        return pre
    }
}