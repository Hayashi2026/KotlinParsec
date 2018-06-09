package com.morimi.parsec

/**
 * 匹配至少0次
 */
class Many(private val parser: Parser) : Parser {

    override fun parse(target: String): Result {
        var pre = Result.success("", target)
        try {
            while (true) {
                val result = parser.parse(pre.remain)
                pre = Result.concat(pre, result)
            }
        } catch (e: ParserException) {
            //do nothing
            println("throw exception while $parser parse ${target.substring(0, if (target.length > 30) 30 else target.length)}")
        }
        return pre
    }

    override fun toString(): String {
        return this.javaClass.simpleName
    }
}