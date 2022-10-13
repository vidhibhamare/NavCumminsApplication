package com.example.navcumminsapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navcumminsapp.databinding.FragmentOthersBinding

class OthersFragment : Fragment() {
    private var binding: FragmentOthersBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentBinding = FragmentOthersBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {

            PO.setOnClickListener { goToFloor1() }
            Lib.setOnClickListener { goToFloor3() }
            Reception.setOnClickListener { goToFloor1() }
            CDO.setOnClickListener { goToFloor5() }
            ReadingHall.setOnClickListener { goToFloor3() }
            Szone.setOnClickListener { goToFloor3() }
            QueryRoom.setOnClickListener { goToFloor1() }
            Terrace.setOnClickListener { goToFloor5() }

        }
    }

    private fun goToFloorG() {
        findNavController().navigate(R.id.action_othersFragment_to_gFragment)
    }

    private fun goToFloor1() {
        findNavController().navigate(R.id.action_othersFragment_to_f1Fragment)
    }

    private fun goToFloor3() {
        findNavController().navigate(R.id.action_othersFragment_to_f3Fragment)
    }

    private fun goToFloor5() {
        findNavController().navigate(R.id.action_othersFragment_to_f5Fragment)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}
