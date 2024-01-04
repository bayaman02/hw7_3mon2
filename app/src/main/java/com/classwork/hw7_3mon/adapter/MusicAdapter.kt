package com.classwork.hw7_3mon.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.classwork.hw7_3mon.activityes.DetailActivity
import com.classwork.hw7_3mon.databinding.ItemMusicBinding
import com.classwork.hw7_3mon.model.Music
import kotlin.reflect.KFunction1

class MusicAdapter(
    private val musicList: List<Music>,
    var onClick: KFunction1<Int, Unit>
) : RecyclerView.Adapter<MusicAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemMusicBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount() = musicList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(musicList[position])
        holder.itemView.setOnClickListener{
            val musicName = musicList[position].name
            val musicSinger = musicList[position].singer
            val intent = Intent(holder.itemView.context, DetailActivity::class.java)
            intent.putExtra("name", musicName)
            intent.putExtra("singer", musicSinger)
            holder.itemView.context.startActivity(intent)
        }
    }

    inner class ViewHolder(private val binding: ItemMusicBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(music: Music){
            binding.apply {
                music.apply {
                    tvName.text = name
                    tvNumber.text = number
                    tvSinger.text = singer
                    tvTime.text = time
                }
            }
        }
    }
}