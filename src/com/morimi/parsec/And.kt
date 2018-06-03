package com.morimi.parsec

class And(private val left: Parser, private val right: Parser): Parser {

    override fun parse(target: String): Result {
        val leftResult = left.parse(target)
        if (!leftResult.succeeded) {
            return Result.fail()
        }
        val rightResult = right.parse(leftResult.remain)
        if (!rightResult.succeeded) {
            return Result.fail()
        }
        return Result.success(leftResult.recognized + " " +  rightResult.recognized, rightResult.remain)
    }
}