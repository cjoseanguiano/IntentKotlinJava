package com.devix.www.usodeintentinkotlin.Kotlin

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.devix.www.usodeintentinkotlin.R
import kotlinx.android.synthetic.main.activity_second_kotlin.*

class SecondKotlin : AppCompatActivity() {

    val value = "SecondJava"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_kotlin)
        val valueOfTakeDataKotlin = intent.getStringExtra("id")

        println(valueOfTakeDataKotlin.repeat(0))
        JsecondKotlin.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                val intent = Intent()
                intent.putExtra(EXTRA_NAMEX, value)
                setResult(Activity.RESULT_OK, intent)
                finish()
            }
        })
    }
}
