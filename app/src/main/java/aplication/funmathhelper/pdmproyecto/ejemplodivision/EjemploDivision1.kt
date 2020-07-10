package aplication.funmathhelper.pdmproyecto.ejemplodivision

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.pdmproyecto.R
import com.example.pdmproyecto.databinding.FragmentEjemploDivision1Binding

/**
 * A simple [Fragment] subclass.
 */
class EjemploDivision1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentEjemploDivision1Binding>(inflater,R.layout.fragment_ejemplo_division_1,container,false)
        binding.btnSiguiente.setOnClickListener {
            it.findNavController().navigate(R.id.action_ejemplo_division_1_to_ejemplo_division_2)
        }
        return binding.root
    }

}
