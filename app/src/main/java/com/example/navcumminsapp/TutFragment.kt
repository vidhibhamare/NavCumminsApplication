package com.example.navcumminsapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navcumminsapp.databinding.FragmentTutBinding


class TutFragment : Fragment() {
    private var binding: FragmentTutBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentBinding = FragmentTutBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {
            Tut1.setOnClickListener { goToFloorG() }
            Tut2.setOnClickListener { goToFloorG() }
            Tut3.setOnClickListener { goToFloor3() }
        }
    }

    private fun goToFloor3() {
        findNavController().navigate(R.id.action_TutFragment_to_f3Fragment)
    }

    private fun goToFloorG() {
        findNavController().navigate(R.id.action_TutFragment_to_gFragment)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}