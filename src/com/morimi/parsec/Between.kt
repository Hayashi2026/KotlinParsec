package com.morimi.parsec

class Between(private val leftParser: Parser, private val middleParser: Parser, private val rightParser: Parser): Parser {

    override fun parse(target: String): Result {
        var leftResult = leftParser.parse(target)
        if (!leftResult.succeeded) {
            return Result.fail()
        }
        val middleResult = middleParser.parse(leftResult.remain)
        if (!middleResult.succeeded) {
            return Result.fail()
        }
        val rightResult = rightParser.parse(middleResult.remain)
        if (!rightResult.succeeded) {
            return Result.fail()
        }
        return Result.success(middleResult.recognized, rightResult.remain)
    }
}