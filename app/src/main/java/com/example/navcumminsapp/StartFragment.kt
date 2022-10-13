package com.example.navcumminsapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navcumminsapp.databinding.FragmentStartBinding


class StartFragment : Fragment() {

    private var binding: FragmentStartBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentBinding = FragmentStartBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {
            selectTeacher.setOnClickListener { goToNextTeacherScreen() }
            selectClassroom.setOnClickListener { goToNextClassScreen() }
            selectTutRoom.setOnClickListener { goToTutScreen() }
            selectLabs.setOnClickListener { goToLabScreen() }
            selectOthers.setOnClickListener { goToOthersScreen() }
        }

    }

    private fun goToNextTeacherScreen() {
        findNavController().navigate(R.id.action_startFragment_to_teacherFragment)
    }

    private fun goToNextClassScreen() {
        findNavController().navigate(R.id.action_startFragment_to_classroomFragment)
    }

    private fun goToTutScreen() {
        findNavController().navigate(R.id.action_startFragment_to_tutFragment)
    }

    private fun goToLabScreen() {
        findNavController().navigate(R.id.action_startFragment_to_labFragment)
    }

    private fun goToOthersScreen() {
        findNavController().navigate(R.id.action_startFragment_to_othersFragment)
    }

}

