package com.lee989898.goodwords

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lee989898.goodwords.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sentenceList = mutableListOf<String>()

        sentenceList.add("꿈을 이루고자 하는 용기만 있다면 모든 꿈을 이룰 수 있다.")
        sentenceList.add("웃음이 없는 하루는 버린 하루다.")
        sentenceList.add("우리는 한 번도 존재하지 않았던 것을 꿈꿀 수 있는 사람들이 필요하다.")
        sentenceList.add("무슨 일을 하기 전에는 그 일에 대해 기대를 가져야 한다.")
        sentenceList.add("조금도 도전하지 않으려고 하는 것이 인생에서 가장 위험한 일이다")
        sentenceList.add("행동은 모든 성공의 가장 기초적인 핵심이다.")
        sentenceList.add("용기란 죽을만큼 두려워도 무언가 해보는 것이다.")
        sentenceList.add("승리는 가장 끈기 있는 사람에게 돌아간다.")



        binding.showAllSentenceBtn.setOnClickListener {
            val intent = Intent(this,SentenceActivity::class.java)
            startActivity(intent)
        }

        binding.goodWordTextArea.setText(sentenceList.random())

    }
}