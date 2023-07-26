package com.mathias.ec3_mathiastrasmonte

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mathias.ec3_mathiastrasmonte.databinding.ItemClotheBinding
import com.mathias.ec3_mathiastrasmonte.model.Clothe

class RVClotheListAdapter(var clothes: List<Clothe>): RecyclerView.Adapter<ClotheVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClotheVH {
        val binding = ItemClotheBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ClotheVH(binding)
    }
    override fun getItemCount(): Int = clothes.size

    override fun onBindViewHolder(holder: ClotheVH, position: Int) {
        holder.bind(clothes[position])
    }
}

class ClotheVH(private val binding: ItemClotheBinding) : RecyclerView.ViewHolder(binding.root){
    fun bind(clothe: Clothe){
        binding.imageView.setImageResource(R.drawable.dresspng)
        binding.txtTitulo.text= clothe.title
        binding.txtPrecio.text = clothe.price
    }
}