package com.morimi.parsec.json

import com.morimi.parsec.*

class Object : Parser {

    override fun parse(target: String): Result {
        val beginObject = Ch('{')
        val endObject = Ch('}')
        val colon = Ch(':')
        val comma = Ch(',')
        val keyAndColon = SEQ(QuotedString(), colon)
        val keyValue = SEQ(keyAndColon, Json())
        val keyValueList = List(keyValue, comma)
        val emptyObject = Between(beginObject, Text(""), endObject)
        return Between(beginObject, OR(keyValueList, Text("")), endObject).parse(target)
    }
}