package com.morimi.parsec

data class Result(var recognized: String, var remain: String, var succeeded: Boolean) {

    companion object {

        fun success(recognized: String, remain: String): Result {
            return Result(recognized, remain, true)
        }

        fun fail(): Result {
            return Result("", "", false)
        }

        fun concat(result1: Result, result2: Result): Result {
            return Result(result1.recognized + result2.recognized, result2.remain, true)
        }
    }
}