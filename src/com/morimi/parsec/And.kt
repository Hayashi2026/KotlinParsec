package com.morimi.parsec

class And(private val left: Parser, private val right: Parser): Parser {

    override fun parse(target: String): Result {
        val leftResult = left.parse(target)
        val rightResult = right.parse(leftResult.remain)
        return Result.success("$leftResult.recognized $rightResult.recognized", rightResult.remain)
    }
}