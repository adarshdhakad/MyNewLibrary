package com.example.mynewlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mylibrary.TestLibrary

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        TestLibrary().test()
    }
}