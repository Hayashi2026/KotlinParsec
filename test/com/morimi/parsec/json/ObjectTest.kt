package com.morimi.parsec.json

import com.morimi.parsec.Result
import org.junit.Test

import org.junit.Assert.*

class ObjectTest {

    @Test
    fun parse() {
        val parser = Object()
        parser.parse("{\"Page\":1,\"Fruits\":[\"apple\",\"peach\",\"pear\"]}")
    }

    @Test
    fun parseEmptyObject() {
        val parser = Object()
        val result = parser.parse("{}")
        assertEquals(result, Result.success("", ""))
    }
}