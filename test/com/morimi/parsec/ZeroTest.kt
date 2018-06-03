package com.morimi.parsec

import org.junit.Test

import org.junit.Assert.*

class ZeroTest {

    @Test
    fun parse() {
        val zero =  Zero()
        val result = zero.parse("test")
        assertEquals(Result.success("", "test"), result)
    }
}