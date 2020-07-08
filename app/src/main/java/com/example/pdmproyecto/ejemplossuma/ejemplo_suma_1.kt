package com.example.pdmproyecto.ejemplossuma

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.pdmproyecto.R
import com.example.pdmproyecto.databinding.FragmentEjemploSuma1Binding

/**
 * A simple [Fragment] subclass.
 */
class ejemplo_suma_1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var binding = DataBindingUtil.inflate<FragmentEjemploSuma1Binding>(inflater,
            R.layout.fragment_ejemplo_suma_1, container,false)
        binding.btnNextSuma.setOnClickListener {
            it.findNavController().navigate(R.id.action_ejemplo_suma_1_to_ejemplo_suma_2)
        }
        //para mostrar barra de menu
        setHasOptionsMenu(true)
        return binding.root
    }
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.exp_operaciones_menu,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item!!,view!!.findNavController()) || super.onOptionsItemSelected(item)
    }
}
