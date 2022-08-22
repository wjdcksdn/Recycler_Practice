package com.example.recycler_practice

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recycler_practice.databinding.ItemRecyclerBinding

class RecyclerViewAdapter: RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>(){
    var datalist = mutableListOf<ProfileData>()

    inner class MyViewHolder(private val binding: ItemRecyclerBinding): RecyclerView.ViewHolder(binding.root) {
        private val imgProfile: ImageView = itemView.findViewById(R.id.img_rv_photo)
        fun bind(profileData: ProfileData){
            //binding.imgRvPhoto.=profileData.profileimg
            binding.tvRvName.text=profileData.name
            binding.tvRvAge.text= profileData.age
            Glide.with(itemView).load(profileData.profileImg).into(imgProfile)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = ItemRecyclerBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int = datalist.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(datalist[position])
    }


}




