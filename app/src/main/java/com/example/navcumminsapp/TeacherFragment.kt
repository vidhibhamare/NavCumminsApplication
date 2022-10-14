
package com.example.navcumminsapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navcumminsapp.databinding.FragmentTeacherBinding


class TeacherFragment : Fragment() {

    private var binding: FragmentTeacherBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentBinding = FragmentTeacherBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {

            VikramAthalaya.setOnClickListener { goToFloorG() }

            SandeepMusale.setOnClickListener { goToFloor1() }
            AnandBewoor.setOnClickListener { goToFloor1() }
            SunitaJahirabadkar.setOnClickListener { goToFloor1() }
            DrAshwiniDeshpande.setOnClickListener { goToFloor1() }

            ManasiGathade.setOnClickListener { goToFloor2() }
            SandhyaPotdar.setOnClickListener { goToFloor2() }
            VidyaSisale.setOnClickListener { goToFloor2() }
            AshutoshMuchrikar.setOnClickListener { goToFloor2() }
            SandhyaArora.setOnClickListener { goToFloor2() }
            SimantineeKulkarni.setOnClickListener { goToFloor2() }
            PrachiWaghmare.setOnClickListener { goToFloor2() }
            PadmaHirave.setOnClickListener { goToFloor2() }
            MrsKSJoshi.setOnClickListener { goToFloor2() }
            DrRRBorhade.setOnClickListener { goToFloor2() }
            NutanDeshpande.setOnClickListener { goToFloor2() }
            VarshaPimpale.setOnClickListener { goToFloor2() }
            SHRajput.setOnClickListener { goToFloor2() }
            NilofarKiittad.setOnClickListener { goToFloor2() }
            GRPhadlkar.setOnClickListener { goToFloor2() }
            MahendraDeore.setOnClickListener { goToFloor2() }
            JyotiBangare.setOnClickListener { goToFloor2() }

            DrNeetaMaitre.setOnClickListener { goToFloor3() }
            SakshiMandke.setOnClickListener { goToFloor3() }
            PriyaDeokar.setOnClickListener { goToFloor3() }
            DrSheetalBarekar.setOnClickListener { goToFloor3() }
            PranjaliDeshpande.setOnClickListener { goToFloor3() }
            AshwiniRajurkar.setOnClickListener { goToFloor3() }
            UmakantDharmik.setOnClickListener { goToFloor3() }

            ProfSNOhathar.setOnClickListener { goToFloor4()}
            DrSRChaudhary.setOnClickListener { goToFloor4()}
            MrsRSPawar.setOnClickListener { goToFloor4()}
            MrsSKNichale.setOnClickListener { goToFloor4()}
            MSPatankar.setOnClickListener { goToFloor4()}
            NDKulkarni.setOnClickListener { goToFloor4()}
            ProfMaheshPote.setOnClickListener { goToFloor4()}
            DrNitinPatan.setOnClickListener { goToFloor4()}
            SGDube.setOnClickListener { goToFloor4()}
            ProfSagarVanarase.setOnClickListener { goToFloor4()}
            DrBVPathate.setOnClickListener { goToFloor4()}
            DrAnitaPatil.setOnClickListener { goToFloor4()}
            DrMrudulDixit.setOnClickListener { goToFloor4()}
            DrAshokKhedkar.setOnClickListener { goToFloor4()}
            DrSachinParanjape.setOnClickListener { goToFloor4()}
            SLSahare.setOnClickListener { goToFloor4()}
            DrMeghaSBorse.setOnClickListener { goToFloor4()}
            MrsDSGhatkamble.setOnClickListener { goToFloor4()}

            ShubhangiTikhe.setOnClickListener { goToFloor5()}
            ShilpaDeshpande.setOnClickListener { goToFloor5()}
            RakhiDongaonkar.setOnClickListener { goToFloor5()}
            MeenalKamlakar.setOnClickListener { goToFloor5()}
            HSKhairnar.setOnClickListener { goToFloor5()}
            SPMengale.setOnClickListener { goToFloor5()}
            PGDate.setOnClickListener { goToFloor5()}
            ChhayaGosavi.setOnClickListener { goToFloor5()}
            ShilpaPant.setOnClickListener { goToFloor5()}
            VaishaliSalgar.setOnClickListener { goToFloor5()}
            AnjaliNaik.setOnClickListener { goToFloor5()}
            AparnaMajare.setOnClickListener { goToFloor5()}
            MadhuriTasgaonkar.setOnClickListener { goToFloor5()}
            SharayuMisardar.setOnClickListener { goToFloor5()}
            SushilaShelke.setOnClickListener { goToFloor5()}
            YoginiKulkarni.setOnClickListener { goToFloor5()}
            VrushaliDeshpande.setOnClickListener { goToFloor5()}

        }
    }

    private fun goToFloorG() {
        findNavController().navigate(R.id.action_teacherFragment_to_gFragment)
    }

    private fun goToFloor1() {
        findNavController().navigate(R.id.action_teacherFragment_to_f1Fragment)
    }

    private fun goToFloor2() {
        findNavController().navigate(R.id.action_teacherFragment_to_f2Fragment)
    }

    private fun goToFloor3() {
        findNavController().navigate(R.id.action_teacherFragment_to_f3Fragment)
    }

    private fun goToFloor4() {
        findNavController().navigate(R.id.action_teacherFragment_to_f4Fragment)
    }

    private fun goToFloor5() {
        findNavController().navigate(R.id.action_teacherFragment_to_f5Fragment)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}
