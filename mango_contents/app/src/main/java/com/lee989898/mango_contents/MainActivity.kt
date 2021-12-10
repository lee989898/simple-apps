package com.lee989898.mango_contents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val items = mutableListOf<ContentsModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bookmarkButton = findViewById<TextView>(R.id.bookmarkBtn)
        bookmarkButton.setOnClickListener {
            val intent = Intent(this, BookmarkActivity::class.java)
            startActivity(intent)
        }


        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/oJxHU8zUmofk",
                "https://mp-seoul-image-production-s3.mangoplate.com/749690_1562932666777248.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "낭만모로코"

            )
        )

        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/uGja1CE039",
                "https://mp-seoul-image-production-s3.mangoplate.com/24665_1631630094690193.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "메종드라카테고리"

            )
        )

        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/wT9UF1w_mNBh",
                "https://mp-seoul-image-production-s3.mangoplate.com/328730/1240996_1558766167770_13857?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "강정이넘치는집"

            )
        )

        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/jbb9pvem-WmM",
                "https://mp-seoul-image-production-s3.mangoplate.com/2925_1589908222064471.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "정식카페"

            )
        )

        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/oJxHU8zUmofk",
                "https://mp-seoul-image-production-s3.mangoplate.com/749690_1562932666777248.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "낭만모로코"

            )
        )

        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/uGja1CE039",
                "https://mp-seoul-image-production-s3.mangoplate.com/24665_1631630094690193.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "메종드라카테고리"

            )
        )

        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/wT9UF1w_mNBh",
                "https://mp-seoul-image-production-s3.mangoplate.com/328730/1240996_1558766167770_13857?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "강정이넘치는집"

            )
        )

        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/jbb9pvem-WmM",
                "https://mp-seoul-image-production-s3.mangoplate.com/2925_1589908222064471.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "정식카페"

            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv)
        val rvAdapter = RVAdapter(baseContext, items)
        recyclerView.adapter = rvAdapter

        rvAdapter.itemClick = object : RVAdapter.ItemClick{
            override fun onClick(view: View, position: Int) {

                val intent = Intent(baseContext, ViewActivity::class.java)
                intent.putExtra("url", items[position].url)
                intent.putExtra("title", items[position].titleText)

                intent.putExtra("imageUrl", items[position].imageUrl)

                startActivity(intent)
            }

        }

        recyclerView.layoutManager = GridLayoutManager(this, 2)


    }
}