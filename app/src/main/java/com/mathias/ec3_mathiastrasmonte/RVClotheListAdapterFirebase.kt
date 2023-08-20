package com.mathias.ec3_mathiastrasmonte

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mathias.ec3_mathiastrasmonte.databinding.ItemClotheBinding
import com.mathias.ec3_mathiastrasmonte.model.ClotheFirebase

class RVClotheListAdapterFirebase(var clothes: List<ClotheFirebase>, private val onClick: (ClotheFirebase) -> Unit) : RecyclerView.Adapter<RVClotheListAdapterFirebase.ClotheViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClotheViewHolder {
        val binding = ItemClotheBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ClotheViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ClotheViewHolder, position: Int) {
        holder.bind(clothes[position])
    }

    override fun getItemCount(): Int = clothes.size

    inner class ClotheViewHolder(private val binding: ItemClotheBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(clothe: ClotheFirebase) {
            Glide
                .with(binding.root.context)
                .load(clothe.img)
                .into(binding.imageView)

            binding.txtTitulo.text= clothe.title
            binding.txtPrecio.text = "S/.${clothe.price}"
            binding.txtDescripcion.text = clothe.description
            binding.root.setOnClickListener { onClick(clothe) }
        }
    }

    fun updateData(newClothes: List<ClotheFirebase>) {
        clothes = newClothes
        notifyDataSetChanged()
    }

}