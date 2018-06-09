package com.morimi.parsec.json

import com.morimi.parsec.Item
import com.morimi.parsec.Result
import com.morimi.parsec.SAT
import org.junit.Assert.assertEquals
import org.junit.Test

class IsUnicodeTest {

    @Test
    fun satisfy() {

        val unicode = SAT(IsUnicode(), Item())
        val result = unicode.parse("，好")
        assertEquals(result, Result.success("，", "好"))
    }
}