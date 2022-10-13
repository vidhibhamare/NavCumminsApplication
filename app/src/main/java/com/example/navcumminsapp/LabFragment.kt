package com.example.navcumminsapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navcumminsapp.databinding.FragmentLabBinding


class LabFragment : Fragment() {
    private var binding: FragmentLabBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentBinding = FragmentLabBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {

            SL1.setOnClickListener { goToFloor5() }
            SL2.setOnClickListener { goToFloorG() }
            SL3.setOnClickListener { goToFloor5() }
            SL4.setOnClickListener { goToFloor5() }
            SL5.setOnClickListener { goToFloorG() }
            SL6.setOnClickListener { goToFloor5() }
            SL7.setOnClickListener { goToFloor5() }
            SL8.setOnClickListener { goToFloor5() }
            SL9.setOnClickListener { goToFloor3() }
            SL10.setOnClickListener { goToFloor3() }
            CL1.setOnClickListener { goToFloor4() }
            CL2.setOnClickListener { goToFloor4() }
            CL3.setOnClickListener { goToFloor4() }
            CL4.setOnClickListener { goToFloor4() }
            MTechLab.setOnClickListener { goToFloor2() }
            ProjectLab.setOnClickListener { goToFloorG() }
            ProjectLabENTC.setOnClickListener { goToFloor4() }
            ENTCLab.setOnClickListener { goToFloorG() }
            EEELab.setOnClickListener { goToFloorG() }
            SETECommLab.setOnClickListener { goToFloor2() }
            CommLab.setOnClickListener { goToFloor4() }
            FOLab.setOnClickListener { goToFloor4() }
            PELab.setOnClickListener { goToFloor4() }
            AELab.setOnClickListener { goToFloor4() }
            BELab.setOnClickListener { goToFloor4() }

        }
    }

    private fun goToFloorG() {
        findNavController().navigate(R.id.action_LabFragment_to_gFragment)
    }

    private fun goToFloor2() {
        findNavController().navigate(R.id.action_LabFragment_to_f2Fragment)
    }

    private fun goToFloor3() {
        findNavController().navigate(R.id.action_LabFragment_to_f3Fragment)
    }

    private fun goToFloor4() {
        findNavController().navigate(R.id.action_LabFragment_to_f4Fragment)
    }

    private fun goToFloor5() {
        findNavController().navigate(R.id.action_LabFragment_to_f5Fragment)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}
