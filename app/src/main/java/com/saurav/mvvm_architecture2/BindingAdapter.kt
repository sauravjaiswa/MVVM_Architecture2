package com.saurav.mvvm_architecture2

import android.content.Context
import android.text.TextWatcher
import android.widget.EditText
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("app:textwatcher")
fun watcher(view:EditText,textwatcher:TextWatcher){
    view.addTextChangedListener(textwatcher)
}

@BindingAdapter(value=["app:imageUrl","app:context"],requireAll = true)
fun image(imageView: ImageView,imageUrl: String,context: Context){
    Glide
        .with(context)
        .load(imageUrl)
        .error(R.drawable.ic_launcher_background)
        .centerCrop()
        .placeholder(R.mipmap.ic_launcher)
        .into(imageView);
}