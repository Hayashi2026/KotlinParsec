package com.morimi.parsec

class And(private val left: Parser, private val right: Parser): Parser {

    override fun parse(target: String): Result {
        val leftResult = left.parse(target)
        val rightResult = right.parse(target)
        return leftResult
    }

    override fun toString(): String {
        return this.javaClass.simpleName + " " + left.toString() + right.toString()
    }

}