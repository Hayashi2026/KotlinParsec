package com.morimi.parsec

import org.junit.Test

import org.junit.Assert.*

class SkipTest {

    @Test
    fun parseMany() {
        val parser = Skip(Ch('a'))
        val result = parser.parse("aaabbb")
        assertEquals(result, Result.success("aaa", "bbb"))
    }

    @Test
    fun parseZero() {
        val parser = Skip(Ch('a'))
        val result = parser.parse("bbbbbb")
        assertEquals(result, Result.success("", "bbbbbb"))
    }
}