package com.example.sli.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.sli.Data.Adapter.menuAdapter
import com.example.sli.Data.Data.providerMenu

import com.example.sli.databinding.FragmentMenuBinding

class MenuFragment : Fragment() {

    private var _binding : FragmentMenuBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpRecycler()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMenuBinding.inflate(inflater, container, false)
        return binding.root
    }

    private fun setUpRecycler(){
        val adapter = menuAdapter()
        val layoutManager = GridLayoutManager(requireContext(),2)
        binding.rvActivitys.adapter = adapter
        binding.rvActivitys.layoutManager = layoutManager
        adapter.setMenu(providerMenu.datos)
    }
}