package com.example.nurzhigit_ishenov_hw_1_m_4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.nurzhigit_ishenov_hw_1_m_4.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListener()
    }

    private fun setupListener(){
        binding.btnSave.setOnClickListener{
            findNavController().navigate(FirstFragmentDirections.actionFirstFragmentToSecondFragment(
                surname = binding.etSurname.text.toString()
                ,name = binding.etName.text.toString()
                , middleName = binding.etMiddleName.text.toString()))
        }
    }
}