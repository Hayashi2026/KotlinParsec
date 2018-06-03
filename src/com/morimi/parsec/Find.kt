package com.morimi.parsec

/**
 * Find 算子跳过不匹配的内容，直到匹配成功
 */
class Find(private val parser: Parser): Parser {

    override fun parse(target: String): Result {
        val stringBuilder = StringBuilder(target)
        for (i in 0 until stringBuilder.length) {
            val result = parser.parse(stringBuilder.substring(i, stringBuilder.length))
            if (result.succeeded) return result
        }
        return Result.fail()
    }
}