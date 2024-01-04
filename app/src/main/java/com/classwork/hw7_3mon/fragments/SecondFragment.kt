package com.classwork.hw7_3mon.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.classwork.hw7_3mon.activityes.DetailActivity
import com.classwork.hw7_3mon.adapter.MusicAdapter
import com.classwork.hw7_3mon.databinding.FragmentSecondBinding
import com.classwork.hw7_3mon.model.Music


class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding

    private val musicList = arrayListOf(
        Music("1","Bad Day","Farxat","2:34"),
        Music("2","New Year","Dosmir","4:11"),
        Music("3","Synyi Tractor","Baibol","2:45"),
        Music("4","Miki Mays","Bekzat","3:43"),
        Music("5","Cucumber","Ilya","2:50"),
        Music("6","Banana","Olesia","3:30"),
        Music("7","Apple","Erbol","2:00"),
        Music("8","Tea","Tilek","4:33"),
        Music("9","Cool","Daniel","10:00")
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
    }

    private fun initAdapter() {
        val adapter = MusicAdapter(musicList, this::onClick)
        binding.rvMusic.adapter = adapter
    }

    private fun onClick(pos:Int){
        val intent = Intent(activity, DetailActivity::class.java)
        intent.putExtra("key2", pos)
        startActivity(intent)
    }
}