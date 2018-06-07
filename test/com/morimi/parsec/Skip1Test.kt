package com.morimi.parsec

import org.junit.Test

import org.junit.Assert.*

class Skip1Test {

    @Test
    fun parse() {
        val parser = Skip1(Ch('a'))
        val result = parser.parse("aaaaabb")
        assertEquals(result, Result.success("aaaaa", "bb"))
    }

    @Test
    fun parseOne() {
        val parser = Skip1(Ch('a'))
        val result = parser.parse("abb")
        assertEquals(result, Result.success("a", "bb"))
    }

    @Test
    fun parseZero() {
        val parser = Skip1(Ch('a'))
        try {
            parser.parse("bbb")
        } catch (e: Exception) {
            assert(e is ParserException)
        }
    }
}