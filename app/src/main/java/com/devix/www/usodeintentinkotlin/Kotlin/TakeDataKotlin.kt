package com.devix.www.usodeintentinkotlin.Kotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import com.devix.www.usodeintentinkotlin.R
import kotlinx.android.synthetic.main.activity_home_kotlin.*

//const val CODIGO = 1
private val CODIGO: Int = 1
val EXTRA_NAMEX = "sendUser"

class TakeDataKotlin : AppCompatActivity() {

    val valueFinal: String = "TakeDataKotlin"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_kotlin)

        KsendIntent.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent(this@TakeDataKotlin, SecondKotlin::class.java)
                intent.putExtra("id", valueFinal)
                startActivityForResult(intent, CODIGO)
            }
        })

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == CODIGO && resultCode == RESULT_OK) {
            val userName = data?.getStringExtra(EXTRA_NAMEX)
            Toast.makeText(this, userName, Toast.LENGTH_SHORT).show()

        }
    }
}
