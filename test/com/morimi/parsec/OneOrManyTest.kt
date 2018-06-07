package com.morimi.parsec

import org.junit.Test

import org.junit.Assert.*

class OneOrManyTest {

    @Test
    fun parseOne() {
        val parser = OneOrMany(Ch('a'))
        val result = parser.parse("abbbb")
        assertEquals(result, Result.success("a", "bbbb"))
    }

    @Test
    fun parseMany() {
        val parser = OneOrMany(Ch('a'))
        val result = parser.parse("aaaaabbbb")
        assertEquals(result, Result.success("aaaaa", "bbbb"))
    }
}