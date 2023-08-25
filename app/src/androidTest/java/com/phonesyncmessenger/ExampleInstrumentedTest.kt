package com.phonesyncmessenger

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.withLock

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        val a = ReentrantLock()
        a.withLock {  }
        val mutex = Mutex()

        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.phonesyncmessenger", appContext.packageName)
    }
}