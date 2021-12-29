package com.lee989898.hearthstone_album

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val warriorImg = findViewById<ImageView>(R.id.main_warrior_iv)
        val shamanImg = findViewById<ImageView>(R.id.main_shaman_iv)
        val rogueImg = findViewById<ImageView>(R.id.main_rogue_iv)
        val paladinImg = findViewById<ImageView>(R.id.main_paladin_iv)
        val hunterImg = findViewById<ImageView>(R.id.main_hunter_iv)
        val druidImg = findViewById<ImageView>(R.id.main_druid_iv)
        val warlockImg = findViewById<ImageView>(R.id.main_warlock_iv)
        val mageImg = findViewById<ImageView>(R.id.main_mage_iv)
        val priestImg = findViewById<ImageView>(R.id.main_priest_iv)
        val demonhunterImg = findViewById<ImageView>(R.id.main_demonhunter_iv)


        warriorImg.setOnClickListener {
            Toast.makeText(this, "전사 클릭 완료", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, WarriorActivity::class.java)
            startActivity(intent)
        }

        shamanImg.setOnClickListener {
            Toast.makeText(this, "주술사 클릭 완료", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, WarriorActivity::class.java)
            startActivity(intent)
        }

        rogueImg.setOnClickListener {
            Toast.makeText(this, "도적 클릭 완료", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, WarriorActivity::class.java)
            startActivity(intent)
        }

        paladinImg.setOnClickListener {
            Toast.makeText(this, "성기사 클릭 완료", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, WarriorActivity::class.java)
            startActivity(intent)
        }

        hunterImg.setOnClickListener {
            Toast.makeText(this, "사냥꾼 클릭 완료", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, WarriorActivity::class.java)
            startActivity(intent)
        }

        druidImg.setOnClickListener {
            Toast.makeText(this, "드루이드 클릭 완료", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, WarriorActivity::class.java)
            startActivity(intent)
        }

        warlockImg.setOnClickListener {
            Toast.makeText(this, "흑마법사 클릭 완료", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, WarriorActivity::class.java)
            startActivity(intent)
        }

        mageImg.setOnClickListener {
            Toast.makeText(this, "마법사 클릭 완료", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, WarriorActivity::class.java)
            startActivity(intent)
        }

        priestImg.setOnClickListener {
            Toast.makeText(this, "사제 클릭 완료", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, WarriorActivity::class.java)
            startActivity(intent)
        }

        demonhunterImg.setOnClickListener {
            Toast.makeText(this, "악마사냥꾼 클릭 완료", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, WarriorActivity::class.java)
            startActivity(intent)
        }

    }
}