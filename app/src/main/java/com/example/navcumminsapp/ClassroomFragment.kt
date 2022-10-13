package com.example.navcumminsapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navcumminsapp.databinding.FragmentClassroomBinding


class ClassroomFragment : Fragment() {
    private var binding: FragmentClassroomBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentBinding = FragmentClassroomBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {
            Class1.setOnClickListener { goToFloor1() }
            Class2.setOnClickListener { goToFloor1() }
            Class3.setOnClickListener { goToFloor1() }
            Class4.setOnClickListener { goToFloor1() }
            Class5.setOnClickListener { goToFloor1() }
            Class6.setOnClickListener { goToFloor1() }
            Class7.setOnClickListener { goToFloor1() }
            Class8.setOnClickListener { goToFloor2() }
            Class9.setOnClickListener { goToFloor2() }
            Class10.setOnClickListener { goToFloor2() }
            Class11.setOnClickListener { goToFloor2() }
            Class12.setOnClickListener { goToFloor2() }
            Class13.setOnClickListener { goToFloor2() }
            Class14.setOnClickListener { goToFloor2() }
        }
    }

    private fun goToFloor1() {
        findNavController().navigate(R.id.action_ClassroomFragment_to_f1Fragment)
    }

    private fun goToFloor2() {
        findNavController().navigate(R.id.action_ClassroomFragment_to_f2Fragment)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}
