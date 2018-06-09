package com.morimi.parsec.json

import com.morimi.parsec.Ch
import com.morimi.parsec.NoneOf
import com.morimi.parsec.ParserException
import com.morimi.parsec.Result
import org.junit.Test

import org.junit.Assert.*

class QuotedStringTest {

    @Test
    fun parseExceptCharacter() {
        val exceptCharacter = NoneOf(EscapeCharacter(), Ch('\u0022'), Ch('\u005C'))
        try {
            val result = exceptCharacter.parse("\u0022")
            assert(false)
        } catch (e: ParserException) {
            assert(true)
        }

    }

    @Test
    fun parse() {
        val quotedString = QuotedString()
        val result = quotedString.parse("\"JSON(JavaScript Object Notation) 是一种轻量级的数据交换格式。它使得人们很容易的进行阅读和编写。\"")
        assertEquals(result, Result.success("JSON(JavaScript Object Notation) 是一种轻量级的数据交换格式。它使得人们很容易的进行阅读和编写。", ""))
    }

    @Test
    fun parseUrl() {
        val quotedString = QuotedString()
        val result = quotedString.parse("\"https://www.json.cn/wiki.html\"")
        assertEquals(result, Result.success("https://www.json.cn/wiki.html", ""))
    }

}