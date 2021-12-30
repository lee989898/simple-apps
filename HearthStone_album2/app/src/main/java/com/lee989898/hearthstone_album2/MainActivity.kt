package com.lee989898.hearthstone_album2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val warriorBtn = findViewById<ImageView>(R.id.main_warrior_iv)
        val shamanBtn = findViewById<ImageView>(R.id.main_shaman_iv)
        val rogueBtn = findViewById<ImageView>(R.id.main_rogue_iv)
        val paladinBtn = findViewById<ImageView>(R.id.main_paladin_iv)
        val hunterBtn = findViewById<ImageView>(R.id.main_hunter_iv)
        val druidBtn = findViewById<ImageView>(R.id.main_druid_iv)
        val warlockBtn = findViewById<ImageView>(R.id.main_warlock_iv)
        val mageBtn = findViewById<ImageView>(R.id.main_mage_iv)
        val priestBtn = findViewById<ImageView>(R.id.main_priest_iv)
        val demonhunterBtn = findViewById<ImageView>(R.id.main_demonhunter_iv)

        warriorBtn.setOnClickListener {

            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "1")
            startActivity(intent)
        }

        shamanBtn.setOnClickListener {

            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "2")
            startActivity(intent)
        }

        rogueBtn.setOnClickListener {

            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "3")
            startActivity(intent)
        }

        paladinBtn.setOnClickListener {

            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "4")
            startActivity(intent)
        }

        hunterBtn.setOnClickListener {

            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "5")
            startActivity(intent)
        }

        druidBtn.setOnClickListener {

            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "6")
            startActivity(intent)
        }

        warlockBtn.setOnClickListener {

            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "7")
            startActivity(intent)
        }

        mageBtn.setOnClickListener {

            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "8")
            startActivity(intent)
        }

        priestBtn.setOnClickListener {

            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "9")
            startActivity(intent)
        }

        demonhunterBtn.setOnClickListener {

            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "10")
            startActivity(intent)
        }

    }
}