package com.morimi.parsec

class Between(private val leftParser: Parser, private val middleParser: Parser, private val rightParser: Parser): Parser {

    override fun parse(target: String): Result {
        var leftResult = leftParser.parse(target)
        val middleResult = middleParser.parse(leftResult.remain)
        val rightResult = rightParser.parse(middleResult.remain)
        return Result.success(middleResult.recognized, rightResult.remain)
    }

    override fun toString(): String {
        return this.javaClass.simpleName + " " + leftParser.toString() + " " + middleParser.toString() + " " + rightParser
    }
}