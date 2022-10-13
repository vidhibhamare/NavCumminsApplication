package com.example.navcumminsapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.navcumminsapp.databinding.FragmentF5Binding


class F5Fragment : Fragment() {

    private var binding: FragmentF5Binding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentBinding = FragmentF5Binding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

}
