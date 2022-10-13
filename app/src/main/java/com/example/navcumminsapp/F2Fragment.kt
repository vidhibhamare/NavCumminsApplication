package com.example.navcumminsapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.navcumminsapp.databinding.FragmentF2Binding


class F2Fragment : Fragment() {

    private var binding: FragmentF2Binding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentBinding = FragmentF2Binding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

}
