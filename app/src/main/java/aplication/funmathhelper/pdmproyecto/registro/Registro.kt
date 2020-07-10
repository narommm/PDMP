package aplication.funmathhelper.pdmproyecto.registro

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.pdmproyecto.R
import com.example.pdmproyecto.databinding.FragmentRegistroBinding


class Registro : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_registro, container, false)
        val binding = DataBindingUtil.inflate<FragmentRegistroBinding>(inflater,
            R.layout.fragment_registro,container,false)

        binding.nAlto.setOnClickListener {
            it.findNavController().navigate(R.id.action_login2_to_registro_Pregunta1)
        }
        binding.nMedio.setOnClickListener {
            it.findNavController().navigate(R.id.action_login2_to_registro_pregunta2)
        }
        binding.nIntermedio.setOnClickListener {
            it.findNavController().navigate(R.id.action_login2_to_registro_pregunta3)
        }
        binding.nAlto.setOnClickListener {
            it.findNavController().navigate(R.id.action_login2_to_registro_pregunta4)
        }
        return binding.root
    }

}
