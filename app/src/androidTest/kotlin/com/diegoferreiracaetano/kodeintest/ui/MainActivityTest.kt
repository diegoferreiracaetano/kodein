package com.diegoferreiracaetano.kodeintest.ui

import android.content.Intent
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import com.diegoferreiracaetano.kodein.ui.MainActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import androidx.test.ext.junit.runners.AndroidJUnit4

@LargeTest
@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @Rule
    @JvmField
    var mActivityTestRule = ActivityTestRule(MainActivity::class.java, false, false)

    @Test
    fun mainActivityTest() {
        mActivityTestRule.launchActivity(Intent())
    }
}
