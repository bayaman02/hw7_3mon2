package com.classwork.hw7_3mon.activityes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.classwork.hw7_3mon.R
import com.classwork.hw7_3mon.databinding.ActivityMainBinding
import com.classwork.hw7_3mon.fragments.FirstFragment
import com.classwork.hw7_3mon.fragments.SecondFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().add(R.id.container_first, FirstFragment()).commit()
        supportFragmentManager.beginTransaction().add(R.id.container_second, SecondFragment()).commit()
    }
}