package com.morimi.parsec

import org.junit.Test

import org.junit.Assert.*

class ManyTillTest {

    @Test
    fun parse() {
        val manyTill = ManyTill(Text("hello"), Ch('a'))
        val result = manyTill.parse("hellohellohelloabbbb")
        assertEquals(result, Result.success("hellohellohelloa", "bbbb"))
    }
}