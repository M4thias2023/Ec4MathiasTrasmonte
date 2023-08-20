package com.mathias.ec3_mathiastrasmonte.views.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mathias.ec3_mathiastrasmonte.RVClotheListAdapter
import com.mathias.ec3_mathiastrasmonte.databinding.FragmentClotheListBinding

class ClotheListFragment : Fragment() {

    private lateinit var binding: FragmentClotheListBinding
    private lateinit var viewModel: ClothesListViewModel
    private lateinit var adapter: RVClotheListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(requireActivity())[ClothesListViewModel::class.java]
    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding =  FragmentClotheListBinding.inflate(inflater,container,false)
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
        viewModel.clothesList.observe(viewLifecycleOwner) { clothes ->
            clothes?.let {
                adapter.clothes = it
                adapter.notifyDataSetChanged()
            }
        }
        viewModel.getClothesFromService()
    }

}