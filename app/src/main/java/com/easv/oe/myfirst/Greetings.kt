package com.easv.oe.myfirst

import java.util.*

class Greetings {

    private val generator = Random()
    val greetingText = arrayOf("Hello", "Hey", "Dear", "Have a nice day")
    val greetingTextDK = arrayOf("Hej", "Goddag", "Dav", "Hejsa", "Halløj")

    public fun get(): String {
        val idx = generator.nextInt(greetingText.size)
        return greetingText[idx];
    }

    public fun getDK(): String {
        val idx = generator.nextInt(greetingTextDK.size)
        return greetingTextDK[idx];
    }
}