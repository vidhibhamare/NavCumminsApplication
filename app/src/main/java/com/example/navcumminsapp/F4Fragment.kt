package com.example.navcumminsapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.navcumminsapp.databinding.FragmentF4Binding


class F4Fragment : Fragment() {

    private var binding: FragmentF4Binding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentBinding = FragmentF4Binding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

}
