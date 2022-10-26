package com.example.week9assessment.ui.myFamily

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyFamilyViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is myFamily Fragment"
    }
    val text: LiveData<String> = _text
}