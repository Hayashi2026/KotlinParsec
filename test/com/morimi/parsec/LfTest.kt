package com.morimi.parsec

import org.junit.Test

import org.junit.Assert.*

class LfTest {

    @Test
    fun parse() {
        val lf = Lf()
        val result = lf.parse("\ntest")
        assertEquals(result, Result.success("\n", "test"))
    }
}