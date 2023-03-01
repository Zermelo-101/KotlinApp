package com.github.zermelo101.kotlinapp

import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.intent.Intents
import androidx.test.espresso.intent.Intents.intended
import androidx.test.espresso.intent.matcher.IntentMatchers.*
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.hamcrest.Matchers.allOf
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class MainActivitytest {
    @get:Rule
    var testRule = ActivityScenarioRule(MainActivity::class.java)
    @Test
    fun testMainActivity(){
        Intents.init()
        val keyboard = androidx.test.espresso.Espresso.onView(ViewMatchers.withId(R.id.mainText))
        keyboard.perform(ViewActions.replaceText("El Hombre"))

        val button = androidx.test.espresso.Espresso.onView(ViewMatchers.withId(R.id.mainButton))
        button.perform(ViewActions.click())
        intended(allOf(hasExtra("name","El Hombre"), hasComponent(GreetingActivity::class.java.name)))
        Intents.release()

    }
}