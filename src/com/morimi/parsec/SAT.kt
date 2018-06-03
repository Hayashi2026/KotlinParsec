package com.morimi.parsec

class SAT(var pre: Predicate, var parser: Parser): Parser {

    override fun parse(target: String): Result {
        val result = parser.parse(target)
        if (result.succeeded && pre.satisfy(result.recognized)) {
            return result
        }
        return Result.fail()
    }
}