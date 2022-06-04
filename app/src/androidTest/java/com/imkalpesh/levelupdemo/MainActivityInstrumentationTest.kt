package com.imkalpesh.levelupdemo

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityInstrumentationTest {
    @get : Rule
    var mActivityRule = ActivityScenarioRule(MainActivity::class.java)

    @Before
    fun setUp() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.layoutMain)).check(matches(isDisplayed()))
    }

    @Test
    fun clickForAddData() {
        onView(withId(R.id.tvContent)).perform(click())
    }
}