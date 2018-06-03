package com.morimi.parsec

/**
 * Choice 算子是多路分支选择算子, choice 顺序检查所有分路,返回第一个成功的算子的解析结果.
 */
class Choice(private vararg val parsers: Parser): Parser {

    override fun parse(target: String): Result {
        for (parser in parsers) {
            val result = parser.parse(target)
            if (result.succeeded) return result
        }
        return Result.fail()
    }
}