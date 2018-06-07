package com.morimi.parsec

/**
 * 跳过匹配0到多次
 */
class Skip(private val parser: Parser) : Parser {

    override fun parse(target: String): Result {
        var pre = Result.success("", target)
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