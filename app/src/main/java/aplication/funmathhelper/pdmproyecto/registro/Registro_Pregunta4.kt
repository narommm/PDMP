package aplication.funmathhelper.pdmproyecto.registro

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.pdmproyecto.R
import com.example.pdmproyecto.databinding.FragmentRegistroPregunta1Binding

/**
 * A simple [Fragment] subclass.
 */
class Registro_Pregunta4 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_registro_pregunta4, container, false)
        //val binding = DataBindingUtil.inflate<FragmentRegistroPregunta4Binding>(inflater,R.layout.fragment_registro_pregunta4,container,false)
        //return binding.root
    }

}
