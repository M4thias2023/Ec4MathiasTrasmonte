package com.mathias.ec3_mathiastrasmonte

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mathias.ec3_mathiastrasmonte.databinding.ItemClotheBinding
import com.mathias.ec3_mathiastrasmonte.model.Clothe
import com.mathias.ec3_mathiastrasmonte.model.ClotheFirebase

class RVClotheListAdapter(var clothes: List<Clothe>,val onClick:(Clothe) -> Unit): RecyclerView.Adapter<ClotheVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClotheVH {
        val binding = ItemClotheBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ClotheVH(binding, onClick)
    }
    override fun getItemCount(): Int = clothes.size

    override fun onBindViewHolder(holder: ClotheVH, position: Int) {
        holder.bind(clothes[position])
    }

}


class ClotheVH(private val binding: ItemClotheBinding, val onClick: (Clothe) -> Unit) : RecyclerView.ViewHolder(binding.root){
    fun bind(clothe: Clothe){
        Glide
            .with(binding.root.context)
            .load(clothe.image)
            .into(binding.imageView)
        binding.txtTitulo.text= clothe.title
        binding.txtPrecio.text = "S/.${clothe.price}"
        binding.txtDescripcion.text = clothe.description
        binding.root.setOnClickListener {
            onClick(clothe)
        }
    }


}