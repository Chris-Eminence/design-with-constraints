package com.example.design

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Button


class designTwo : AppCompatActivity() {

    private lateinit var _increment: Button
    private lateinit var textView: TextView
    private lateinit var _decrement: Button

    /**--The lateinit keyword stands
    for late initialization. Lateinit comes
    very handy when a non-null initializer cannot
    be supplied in the constructor,
    but the developer is certain that the variable
    will not be null when accessing it, thus avoiding
    null checks when referencing it later.--**/


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_design_two)

        _increment = findViewById(R.id.plusButton)
        _decrement = findViewById(R.id.minusButton)
        textView = findViewById(R.id.textViewNumber)


        var number = 0

        _increment.setOnClickListener { textView.text = number++.toString() }
        _decrement.setOnClickListener { textView.text = number--.toString() }


//        plusButton.setOnClickListener{
//
//            textViewNumber.text = plusButton.toString();
//
//         minusButton.setOnClickListener{
//             textV -1
//             textViewNumber.text = minusButton.toString()
//         }

        }

}