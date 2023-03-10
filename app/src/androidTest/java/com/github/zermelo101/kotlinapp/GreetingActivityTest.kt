package com.github.zermelo101.kotlinapp
import android.content.Intent
import androidx.test.core.app.ActivityScenario
import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class GreetingActivityTest{

    @Test
    fun greeting(){
        val greeting = Intent(ApplicationProvider.getApplicationContext(), GreetingActivity::class.java)
        val name = "Steve"
        greeting.putExtra("name",name)

        var res : ActivityScenario<GreetingActivity> = ActivityScenario.launch(greeting)
        onView(ViewMatchers.withText("Welcome Steve")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        res.close()
    }

}