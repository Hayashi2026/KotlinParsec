package com.morimi.parsec

/**
 * 至少跳过1次
 */
class Skip1(private val parser: Parser): Parser {

    override fun parse(target: String): Result {
        var pre = parser.parse(target)
        try {
            while (true) {
                val result = parser.parse(pre.remain)
                pre = Result.concat(pre, result)
            }
        } catch (e: ParserException) {
            //do nothing
        }
        return pre
    }
}