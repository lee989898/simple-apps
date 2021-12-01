package com.lee989898.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.lee989898.dice.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val diceImage1 = binding.dice1
        val diceImage2 = binding.dice2

        binding.diceStartBtn.setOnClickListener {



            Toast.makeText(this,"주사위 고!", Toast.LENGTH_SHORT).show()

            Random.nextInt(1, 6)
            Random.nextInt(1,6)

            val number1 = Random.nextInt(1,6)
            val number2 = Random.nextInt(1,6)

            if(number1 == 1){
                diceImage1.setImageResource(R.drawable.dice_1)
            } else if(number1 == 2){
                diceImage1.setImageResource(R.drawable.dice_2)
            } else if(number1 == 3){
                diceImage1.setImageResource(R.drawable.dice_3)
            } else if(number1 == 4){
                diceImage1.setImageResource(R.drawable.dice_4)
            } else if(number1 == 5){
                diceImage1.setImageResource(R.drawable.dice_5)
            } else {
                diceImage1.setImageResource(R.drawable.dice_6)
            }

            if(number2 == 1){
                diceImage2.setImageResource(R.drawable.dice_1)
            } else if(number1 == 2){
                diceImage2.setImageResource(R.drawable.dice_2)
            } else if(number1 == 3){
                diceImage2.setImageResource(R.drawable.dice_3)
            } else if(number1 == 4){
                diceImage2.setImageResource(R.drawable.dice_4)
            } else if(number1 == 5){
                diceImage2.setImageResource(R.drawable.dice_5)
            } else {
                diceImage2.setImageResource(R.drawable.dice_6)
            }


        }



    }
}