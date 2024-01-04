package com.classwork.hw7_3mon.activityes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.classwork.hw7_3mon.R
import com.classwork.hw7_3mon.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val name = intent.getStringExtra("name")
        val singer = intent.getStringExtra("singer")
        binding.tvName.text = name
        binding.tvSinger.text = singer
    }
}