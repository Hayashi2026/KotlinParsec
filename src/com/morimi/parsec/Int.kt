package com.morimi.parsec

class Int: Parser {

    override fun parse(target: String): Result {
        val negative = SEQ(Ch('-'), OneOrMany(Digit()))
        val positive = OneOrMany(Digit())
        return OR(positive, negative).parse(target)
    }
}