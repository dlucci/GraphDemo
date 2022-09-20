package com.example.graphdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.graphdemo.databinding.FragmentValidationBinding

class ValidationFragment : Fragment() {

    private lateinit var binding: FragmentValidationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentValidationBinding.inflate(layoutInflater)
        (arguments?.getString("firstName") + " " + arguments?.getString("lastName")).also { binding.name.text = it }
        return binding.root
    }
}