package com.morimi.parsec.json

import com.morimi.parsec.*

class Word : Parser {

    val parser = OneOrMany(SAT(IsAlpha(), Item()))

    override fun parse(target: String): Result {
        return parser.parse(target)
    }
}