package com.imkalpesh.levelupdemo


import android.os.SystemClock
import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.GeneralLocation
import androidx.test.espresso.action.GeneralSwipeAction
import androidx.test.espresso.action.Press
import androidx.test.espresso.action.Swipe
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.contrib.RecyclerViewActions.scrollToPosition
import androidx.test.espresso.matcher.ViewMatchers.*
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
    fun checkSpiderManTitleAndContentAtFirstPosition() {
        onView(withId(R.id.rvBanners)).perform(scrollToPosition<ViewHolder>(0))
        onView(withId(R.id.tvTitle)).check(matches(withText(R.string.spider_man)))
        onView(withId(R.id.tvContent)).check(matches(withText(R.string.spider_man_details)))
        onView(withId(R.id.tvPage)).check(matches(withText("1 / 10")))
        SystemClock.sleep(1500);
    }

    @Test
    fun checkAvengerTitleAndContentAtSecondPosition() {
        onView(withId(R.id.rvBanners)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, GeneralSwipeAction(Swipe.SLOW, GeneralLocation.BOTTOM_RIGHT, GeneralLocation.BOTTOM_LEFT, Press.FINGER)))
        Thread.sleep(1500);
        onView(withId(R.id.tvTitle)).check(matches(withText(R.string.avengers)))
        onView(withId(R.id.tvContent)).check(matches(withText(R.string.avengers_details)))
        onView(withId(R.id.tvPage)).check(matches(withText("2 / 10")))
    }

    @Test
    fun captainAmericaTitleAndContentAtThirdPosition() {
        onView(withId(R.id.rvBanners)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(1, GeneralSwipeAction(Swipe.SLOW, GeneralLocation.BOTTOM_RIGHT, GeneralLocation.BOTTOM_LEFT, Press.FINGER)))
        Thread.sleep(1500);
        onView(withId(R.id.tvTitle)).check(matches(withText(R.string.captain_america)))
        onView(withId(R.id.tvContent)).check(matches(withText(R.string.captain_america_details)))
        onView(withId(R.id.tvPage)).check(matches(withText("3 / 10")))
    }

    @Test
    fun hulkTitleAndContentAtFourthPosition() {
        onView(withId(R.id.rvBanners)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(2, GeneralSwipeAction(Swipe.SLOW, GeneralLocation.BOTTOM_RIGHT, GeneralLocation.BOTTOM_LEFT, Press.FINGER)))
        Thread.sleep(1500);
        onView(withId(R.id.tvTitle)).check(matches(withText(R.string.hulk)))
        onView(withId(R.id.tvContent)).check(matches(withText(R.string.hulk_details)))
        onView(withId(R.id.tvPage)).check(matches(withText("4 / 10")))
    }

    @Test
    fun batmanTitleAndContentAtFifthPosition() {
        onView(withId(R.id.rvBanners)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(3, GeneralSwipeAction(Swipe.SLOW, GeneralLocation.BOTTOM_RIGHT, GeneralLocation.BOTTOM_LEFT, Press.FINGER)))
        Thread.sleep(1500);
        onView(withId(R.id.tvTitle)).check(matches(withText(R.string.bat_man)))
        onView(withId(R.id.tvContent)).check(matches(withText(R.string.bat_man_details)))
        onView(withId(R.id.tvPage)).check(matches(withText("5 / 10")))
    }

    @Test
    fun thanosTitleAndContentAtFifthPosition() {
        onView(withId(R.id.rvBanners)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(4, GeneralSwipeAction(Swipe.SLOW, GeneralLocation.BOTTOM_RIGHT, GeneralLocation.BOTTOM_LEFT, Press.FINGER)))
        Thread.sleep(1500);
        onView(withId(R.id.tvTitle)).check(matches(withText(R.string.thanos)))
        onView(withId(R.id.tvContent)).check(matches(withText(R.string.thanos_details)))
        onView(withId(R.id.tvPage)).check(matches(withText("6 / 10")))
    }

    @Test
    fun thorTitleAndContentAtFifthPosition() {
        onView(withId(R.id.rvBanners)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(5, GeneralSwipeAction(Swipe.SLOW, GeneralLocation.BOTTOM_RIGHT, GeneralLocation.BOTTOM_LEFT, Press.FINGER)))
        Thread.sleep(1500);
        onView(withId(R.id.tvTitle)).check(matches(withText(R.string.thor)))
        onView(withId(R.id.tvContent)).check(matches(withText(R.string.thor_details)))
        onView(withId(R.id.tvPage)).check(matches(withText("7 / 10")))
    }

    @Test
    fun wonderWomanTitleAndContentAtFifthPosition() {
        onView(withId(R.id.rvBanners)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(6, GeneralSwipeAction(Swipe.SLOW, GeneralLocation.BOTTOM_RIGHT, GeneralLocation.BOTTOM_LEFT, Press.FINGER)))
        Thread.sleep(1500);
        onView(withId(R.id.tvTitle)).check(matches(withText(R.string.wonder_woman)))
        onView(withId(R.id.tvContent)).check(matches(withText(R.string.wonder_woman_details)))
        onView(withId(R.id.tvPage)).check(matches(withText("8 / 10")))
    }

    @Test
    fun ironManTitleAndContentAtFifthPosition() {
        onView(withId(R.id.rvBanners)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(7, GeneralSwipeAction(Swipe.SLOW, GeneralLocation.BOTTOM_RIGHT, GeneralLocation.BOTTOM_LEFT, Press.FINGER)))
        Thread.sleep(1500);
        onView(withId(R.id.tvTitle)).check(matches(withText(R.string.iron_man)))
        onView(withId(R.id.tvContent)).check(matches(withText(R.string.iron_man_details)))
        onView(withId(R.id.tvPage)).check(matches(withText("9 / 10")))
    }

    @Test
    fun xManTitleAndContentAtFifthPosition() {
        onView(withId(R.id.rvBanners)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(8, GeneralSwipeAction(Swipe.SLOW, GeneralLocation.BOTTOM_RIGHT, GeneralLocation.BOTTOM_LEFT, Press.FINGER)))
        Thread.sleep(1500);
        onView(withId(R.id.tvTitle)).check(matches(withText(R.string.x_man)))
        onView(withId(R.id.tvContent)).check(matches(withText(R.string.x_man_details)))
        onView(withId(R.id.tvPage)).check(matches(withText("10 / 10")))
    }


}