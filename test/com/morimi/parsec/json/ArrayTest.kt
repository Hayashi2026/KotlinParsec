package com.morimi.parsec.json

import com.morimi.parsec.Result
import org.junit.Test

import org.junit.Assert.*

class ArrayTest {

    @Test
    fun parse() {
        val array = Array()
        val result = array.parse("[\"apple\",\"peach\",\"pear\"]")
    }

    @Test
    fun parseEmptyArray() {
        val array = Array()
        val result = array.parse("[]")
        assertEquals(result, Result.success("", ""))
    }
}