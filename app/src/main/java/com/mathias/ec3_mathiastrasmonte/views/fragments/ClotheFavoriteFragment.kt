package com.mathias.ec4_mathiastrasmonte.views.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mathias.ec4_mathiastrasmonte.RVClotheListAdapter
import com.mathias.ec4_mathiastrasmonte.databinding.FragmentClotheFavoriteBinding
class ClotheFavoriteFragment : Fragment() {
    private lateinit var binding: FragmentClotheFavoriteBinding
    private lateinit var viewModel: ClotheFavoriteViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(ClotheFavoriteViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentClotheFavoriteBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = RVClotheListAdapter(listOf()){ clothe ->
            val clotheDetailDirection = ClotheListFragmentDirections.actionClotheListFragmentToClotheDetailFragment(clothe)
            findNavController().navigate(clotheDetailDirection)
        }
        binding.rvClotheList.adapter = adapter
        binding.rvClotheList.layoutManager =GridLayoutManager(requireContext(),1,RecyclerView.VERTICAL,false)
        viewModel.favorites.observe(viewLifecycleOwner) { clothes ->
            clothes?.let {
                adapter.clothes = it
                adapter.notifyDataSetChanged()
            }
        }
        viewModel.getFavorites()
    }

}