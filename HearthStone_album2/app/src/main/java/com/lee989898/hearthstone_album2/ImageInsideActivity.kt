package com.lee989898.hearthstone_album2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ImageInsideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_inside)

        val getData = intent.getStringExtra("data")

        val changeImage = findViewById<ImageView>(R.id.inside_image_area_iv)

        if(getData == "1"){
            changeImage.setImageResource(R.drawable.warrior)
        }
        if(getData == "2"){
            changeImage.setImageResource(R.drawable.warrior)
        }
        if(getData == "3"){
            changeImage.setImageResource(R.drawable.warrior)
        }
        if(getData == "4"){
            changeImage.setImageResource(R.drawable.warrior)
        }
        if(getData == "5") {
            changeImage.setImageResource(R.drawable.warrior)
        }
        if(getData == "6"){
            changeImage.setImageResource(R.drawable.warrior)
        }
        if(getData == "7"){
            changeImage.setImageResource(R.drawable.warrior)
        }
        if(getData == "8"){
            changeImage.setImageResource(R.drawable.warrior)
        }
        if(getData == "9"){
            changeImage.setImageResource(R.drawable.warrior)
        }
        if(getData == "10"){
            changeImage.setImageResource(R.drawable.warrior)
        }








    }
}