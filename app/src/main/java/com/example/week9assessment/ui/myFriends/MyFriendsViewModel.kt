package com.example.week9assessment.ui.myFriends

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyFriendsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is My Friends Fragment"
    }
    val text: LiveData<String> = _text
}