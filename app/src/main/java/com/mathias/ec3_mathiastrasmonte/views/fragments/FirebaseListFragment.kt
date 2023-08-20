package com.mathias.ec3_mathiastrasmonte.views.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mathias.ec3_mathiastrasmonte.R
import com.mathias.ec3_mathiastrasmonte.RVClotheListAdapterFirebase
import com.mathias.ec3_mathiastrasmonte.databinding.FragmentFirebaseListBinding
import com.mathias.ec3_mathiastrasmonte.views.AddClotheActivity

class FirebaseListFragment : Fragment() {

    private lateinit var binding: FragmentFirebaseListBinding
    private lateinit var adapter: RVClotheListAdapterFirebase
    private lateinit var viewModel: FirestoreViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentFirebaseListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = RVClotheListAdapterFirebase(emptyList()) { /* Handle item click here */ }
        viewModel = ViewModelProvider(this).get(FirestoreViewModel::class.java)

        binding.rvClotheList.adapter = adapter
        binding.rvClotheList.layoutManager =
            GridLayoutManager(requireContext(), 1, RecyclerView.VERTICAL, false)

        viewModel.clothes.observe(viewLifecycleOwner, Observer { clothes ->
            adapter.updateData(clothes)
            adapter.notifyDataSetChanged()
        })

        viewModel.getFirebaseList()

        binding.fabAddClothe.setOnClickListener {
            val intent = Intent(requireContext(), AddClotheActivity::class.java)
            startActivity(intent)
        }
    }
}