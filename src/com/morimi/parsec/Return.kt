package com.morimi.parsec

class Return(val string: String): Parser {

    override fun parse(target: String): Result {
        return Result.success(string, target)
    }
}