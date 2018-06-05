package com.morimi.parsec

import org.junit.Test

import org.junit.Assert.*

class FindTest {

    @Test
    fun parseChar() {
        val find = Find(Ch('c'))
        val result = find.parse("hdkkkkiooicjjj")
        assertEquals(result, Result.success("c", "jjj"))
    }

    @Test
    fun parseText() {
        val find = Find(Text("hello"))
        val result = find.parse("hdkkkkihellooicjjj")
        assertEquals(result, Result.success("hello", "oicjjj"))
    }
}