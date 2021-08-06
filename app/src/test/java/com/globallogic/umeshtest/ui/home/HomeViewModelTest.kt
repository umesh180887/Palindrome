package com.globallogic.umeshtest.ui.home

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.google.common.truth.Truth.assertThat
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test

class HomeViewModelTest{

    @get:Rule
    val rule = InstantTaskExecutorRule()

    private val testCheckPalindrome: HomeViewModel = HomeViewModel()

    /*@Test
    fun `Please enter text in field`(){
        assertThat(testCheckPalindrome.checkPalindrome(""))
    }*/


    @Test
    fun testPalindrome() {

        var expected = "Please enter text in above field"
        assertEquals(expected, testCheckPalindrome.checkPalindrome(""))

        expected = "Not Palindrome"
        assertEquals(expected, testCheckPalindrome.checkPalindrome("123"))
        assertEquals(expected, testCheckPalindrome.checkPalindrome("Umesh"))

        expected = "Palindrome"
        assertEquals(expected, testCheckPalindrome.checkPalindrome("Madam"))
        assertEquals(expected, testCheckPalindrome.checkPalindrome("madam"))
        assertEquals(expected, testCheckPalindrome.checkPalindrome("Madam was saw madam"))
    }
}