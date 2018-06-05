package com.morimi.parsec

import org.junit.Test

import org.junit.Assert.*

class TextTest {

    @Test
    fun parse() {
        val textParser = Text("hello")
        val result = textParser.parse("helloworld")
        assertEquals(result, Result.success("hello", "world"))
    }

}