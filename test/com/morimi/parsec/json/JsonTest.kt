package com.morimi.parsec.json

import org.junit.Test

class JsonTest {

    @Test
    fun parse() {
        val parser = Json()
        parser.parse("{\"Page\":1,\"Fruits\":[\"apple\",\"peach\",\"pear\"]}")
        assert(true)
    }
}