package com.morimi.parsec

import org.junit.Test

import org.junit.Assert.*

class CharacterTest {

    @Test
    fun parse() {
        val character = Character('c')
        val result = character.parse("chat")
        assertEquals(result, Result.success("c", "hat"))
    }

    @Test
    fun parseFail() {
        val character = Character('c')
        val result = character.parse("test")
        assertEquals(result, Result.fail())
    }
}