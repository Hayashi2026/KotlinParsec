package com.morimi.parsec

import org.junit.Test

import org.junit.Assert.*

class EqualTest {

    @Test
    fun parse() {
        val equal = Equal("aaa")
        val result = equal.parse("aaa")
        assertEquals(result, Result.success("aaa", ""))
    }
}