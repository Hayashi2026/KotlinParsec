package com.morimi.parsec

import org.junit.Test

import org.junit.Assert.*

class ItemTest {

    @Test
    fun parse() {
        val item = Item()
        val result = item.parse("test")
        assertEquals(result, Result.success("t", "est"))
    }

}