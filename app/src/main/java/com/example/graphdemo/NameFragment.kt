package com.example.graphdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.graphdemo.databinding.FragmentNameBinding
import com.example.graphdemo.databinding.LandingFragmentBinding

class NameFragment : Fragment() {

    lateinit var binding: FragmentNameBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNameBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.vaidation.setOnClickListener {
            val action = NameFragmentDirections.actionNameToValidation(
                binding.firstName.text.toString(),
                binding.lastName.text.toString()
            )
            it.findNavController().navigate(action)
        }
    }
}