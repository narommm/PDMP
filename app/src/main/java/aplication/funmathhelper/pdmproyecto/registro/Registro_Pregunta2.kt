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
class Registro_Pregunta2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //val binding = DataBindingUtil.inflate<FragmentRegistroPregunta2Binding>(inflater,R.layout.fragment_registro_pregunta2,container,false)
        return inflater.inflate(R.layout.fragment_registro_pregunta2, container, false)

       // return binding.root

    }

}