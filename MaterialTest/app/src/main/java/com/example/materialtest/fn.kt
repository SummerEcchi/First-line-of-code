package com.example.materialtest

fun <T: Comparable<T>> min(vararg nums: T): T {
    var minNum = nums[0]
    for (num in nums) {
        if (num < minNum) minNum = num
    }
    return minNum
}

fun main() {
    println(min(1,201,3131))
}