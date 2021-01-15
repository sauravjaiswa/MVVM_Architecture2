package com.saurav.mvvm_architecture2.viewmodel

import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModel:ViewModel() {
    var textData=MutableLiveData<String>()
    var btnName=MutableLiveData<String>()
    var edtxt=MutableLiveData<String>()
    var imageUrl=MutableLiveData<String>()

    fun onClick(view: View){
        textData.value="Changed"
        btnName.value="Done"
    }

//    var emailTextWatcher: TextWatcher=object : TextWatcher{
//        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
//
//        }
//
//        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
//            Log.i("Text Watcher:",p0.toString())
//
//        }
//
//        override fun afterTextChanged(p0: Editable?) {
//
//        }
//
//    }

}