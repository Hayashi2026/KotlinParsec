package com.morimi.parsec

class OneOf(val set: Set<String>) : Parser {

    override fun parse(target: String): Result {
        for (item in set) {
            if (target.startsWith(item)) {
                return Result.success(item, target.substring(item.length, target.length))
            }
        }
        throw ParserException("Expect target start with one of $set")
    }
}