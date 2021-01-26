package com.easv.oe.myfirst

import java.util.*


class Greetings {

    val generator = Random()
    val greetingText = arrayOf("Hello", "Hey", "Dear", "Have a nice day")


    public fun get(): String {
        val idx = generator.nextInt(greetingText.size)
        return greetingText[idx];
    }
}