package com.morimi.parsec.json

import com.morimi.parsec.*

class Json : Parser {

    val parser = OneOf(Null(), Bool(), Int(), QuotedString(), Array(), Object())

    override fun parse(target: String): Result {
        return parser.parse(target)
    }

}