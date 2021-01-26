package com.example.scientific_uzbekistan

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_data_.*

class Data_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_)

        val bundle: Bundle = intent.extras!!

        val key: Int = bundle.getInt("rasmi")

        books.setImageResource(key)

        val texts: String = bundle.getString("narxi").toString()

        price.setText(texts)

    }
}