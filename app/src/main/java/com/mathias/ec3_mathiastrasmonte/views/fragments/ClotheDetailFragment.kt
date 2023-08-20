package com.mathias.ec3_mathiastrasmonte.views.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.mathias.ec3_mathiastrasmonte.databinding.FragmentClotheDetailBinding
import com.mathias.ec3_mathiastrasmonte.model.Clothe
import com.shashank.sony.fancytoastlib.FancyToast

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
        binding.btnAddFavorite.apply {
            visibility = if (clothe.isFavorite) View.GONE else View.VISIBLE
        }
        binding.btnAddFavorite.setOnClickListener {
            clothe.isFavorite = true
            viewModel.addFavorites(clothe)
            FancyToast.makeText(requireContext(),"Elemento agregado a favoritos!",FancyToast.LENGTH_LONG,FancyToast.SUCCESS,true).show();
        }
        binding.btnDeleteFavorite.apply {
            visibility= if (!clothe.isFavorite) View.GONE else View.VISIBLE
        }
        binding.btnDeleteFavorite.setOnClickListener {
            clothe.isFavorite = false
            viewModel.removeFavorite(clothe)
            FancyToast.makeText(requireContext(),"Elemento eliminado!",FancyToast.LENGTH_LONG,FancyToast.SUCCESS,true).show();
            navigatetoDetailList()
        }
    }

    private fun navigatetoDetailList(){
        val action = ClotheDetailFragmentDirections.actionClotheDetailFragmentToClotheFavoriteFragment()
        findNavController().navigate(action)
    }

}