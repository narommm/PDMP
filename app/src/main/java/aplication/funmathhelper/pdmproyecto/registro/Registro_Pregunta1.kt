package aplication.funmathhelper.pdmproyecto.registro

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.pdmproyecto.R
import com.example.pdmproyecto.databinding.FragmentRegistroPregunta1Binding

/**
 * A simple [Fragment] subclass.
 */
class Registro_Pregunta1 : Fragment() {
    private lateinit var viewModel: RegistroPregunta1ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding= DataBindingUtil.inflate<FragmentRegistroPregunta1Binding>(inflater,R.layout.fragment_registro__pregunta1,container,false)
        viewModel = ViewModelProvider(this).get(RegistroPregunta1ViewModel::class.java)

        binding.registronivelbajo = viewModel

        return binding.root
    }

}
