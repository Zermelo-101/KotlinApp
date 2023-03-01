package com.github.zermelo101.kotlinapp

import android.content.Intent
import androidx.test.core.app.ActivityScenario
import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class GreetingActivityTest {
    @Test
    fun testGreetingActivity(){
        val intent = Intent(ApplicationProvider.getApplicationContext(),GreetingActivity::class.java)
        intent.putExtra("name","Jeff")
        val x : ActivityScenario<GreetingActivity> = ActivityScenario.launch(intent)
        onView(ViewMatchers.withText("Welcome Jeff")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        x.close()
    }
}