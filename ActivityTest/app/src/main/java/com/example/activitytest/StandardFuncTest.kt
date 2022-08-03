package com.example.activitytest

fun ta1(t: ((Int,Int) -> Int) = {a,b -> a+b}): Int{
    return t(12,3)
}

fun main() {
    /*
    val d1 = ta1()
    val d2 = ta1 { a,b ->
        a*b
    }

    println("d1 $d1, d2 $d2")
    val result = with(StringBuilder()) {
        append("Start eating fruits.\n")
        for (item in list) {
            append(item).append("\n")
        }
        append("Ate all fruits.")

        toString()
    }

    val result = StringBuilder().run {
        append("Start eating fruits.\n")
        for (item in list) {
            append(item).append("\n")
        }
        append("Ate all fruits.")

        toString()
    }
    */
    val list = listOf("Apple", "Banana", "Orange", "pear", "Grape")
    val result = StringBuilder().apply {
        append("Start eating fruits.\n")
        for (item in list) {
            append(item).append("\n")
        }
        append("Ate all fruits.")
    }
    println(result.toString())
}