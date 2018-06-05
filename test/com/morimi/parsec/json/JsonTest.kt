package com.morimi.parsec.json

import org.junit.Test

import org.junit.Assert.*

class JsonTest {

    @Test
    fun parse() {
        val parser = Json()
        val result = parser.parse("{\"name\":\"NIX\",\"age\":18,\"detail\":{\"skills\":[\"Swift on iOS\",\"C on Linux\"],\"projects\":[{\"name\":\"coolie\",\"intro\":\"Generate models from a JSON file\"},{\"name\":\"parser\",\"intro\":null}]}}")
        println(result)

        val test2 = parser.parse("\"GetUserPostByIdResult\":{\"Age\":\"33\",\"ID\":\"2server\",\"Name\":\"haorooms\"")
        println(test2)
    }
}