package de.pottcode.schietwedda


import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * (c) Dimitri Simon on 22.06.20
 */
@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    val mainActivityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun checkCityNameIsDisplayedCorrectly() {
        onView(withId(R.id.button_fetch_forecast)).perform(click())
        onView(withId(R.id.textView_weather_forecast)).check(matches(withText("Hello World")))
    }
}