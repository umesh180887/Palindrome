package com.globallogic.umeshtest.ui.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    var message: MutableLiveData<String>? = null

    init {
        message = MutableLiveData<String>()
    }

    fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
        val inputValue = s.toString()
        checkPalindrome(inputValue)
    }

    fun checkPalindrome(s: String): String {
        val inputValue = s.trim().toLowerCase()
        var testValue = ""
        testValue = when {
            inputValue.isEmpty() -> {
                "Please enter text in above field"
            }
            inputValue == inputValue.reversed() -> {
                "Palindrome"
            }
            else -> {
                "Not Palindrome"
            }
        }
        message?.value = testValue
        return testValue
    }
}
