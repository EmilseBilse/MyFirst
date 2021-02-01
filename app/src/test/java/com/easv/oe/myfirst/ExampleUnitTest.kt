package com.easv.oe.myfirst

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {


    @Test
    fun testGreetings() {
        val greetings = Greetings()
        val g = greetings.get()
        assertTrue(greetings.greetingText.contains(g))
    }

    @Test
    fun testGreetingsForRandomness() {
        val greetings = Greetings()
        greetings.greetingText.forEach { s ->
            var found = false
            for (i in 1..10000) {
                //found = if (greetings.get().equals(s)) true else found
                if (greetings.get().equals(s))
                {
                    found = true
                    break
                }
            }
            assertTrue(found)
        }
    }

}
