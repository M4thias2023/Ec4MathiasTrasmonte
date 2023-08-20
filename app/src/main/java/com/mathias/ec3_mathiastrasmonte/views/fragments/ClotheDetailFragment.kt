package com.mathias.ec4_mathiastrasmonte.views.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.mathias.ec4_mathiastrasmonte.databinding.FragmentClotheDetailBinding
import com.mathias.ec4_mathiastrasmonte.model.Clothe

class ClotheDetailFragment : Fragment() {

    private lateinit var binding: FragmentClotheDetailBinding
    val args: ClotheDetailFragmentArgs by navArgs()
    private lateinit var clothe: Clothe
    private lateinit var viewModel: ClothesDetailViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        clothe = args.clothe
        viewModel = ViewModelProvider(requireActivity()).get(ClothesDetailViewModel::class.java)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentClotheDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Glide
            .with(binding.root.context)
            .load(clothe.image)
            .into(binding.imgClothe)
        binding.txtTitulo.text= clothe.title
        binding.txtPrecio.text = "S/.${clothe.price}"
        binding.txtDescripcion.text = clothe.description
        binding.btnAddFavorite.setOnClickListener {
            viewModel.addFavorites(clothe)
        }
    }


}