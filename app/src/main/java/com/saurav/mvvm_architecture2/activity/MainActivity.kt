package com.saurav.mvvm_architecture2.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.saurav.mvvm_architecture2.R
import com.saurav.mvvm_architecture2.databinding.ActivityMainBinding
import com.saurav.mvvm_architecture2.viewmodel.ViewModel

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding
    lateinit var viewModel: ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel=ViewModelProvider(this).get(ViewModel::class.java)
        binding.viewmodel=viewModel
        binding.lifecycleOwner=this
        binding.mcontext=this

        viewModel.imageUrl.value="jshd"

        viewModel.edtxt.observe(this, Observer {
            Log.i("Text Observer:",it.toString())
        })

        viewModel.textData.value="This is a MVVM"
        viewModel.btnName.value="Ok"
    }
}