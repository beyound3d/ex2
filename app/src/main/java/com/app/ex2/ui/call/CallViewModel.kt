package com.app.ex2.ui.call

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CallViewModel: ViewModel() {

//    val count: MutableLiveData<Int> = MutableLiveData(0)
//
//    // Function to update the count value
//    fun incrementCount() {
//        count.value = (count.value ?: 0) + 1
//    }

    private val _text = MutableLiveData<String>().apply {
        value = "This is Call Fragment"
    }
    val text: LiveData<String> = _text
}