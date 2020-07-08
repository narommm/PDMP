package com.example.pdmproyecto.ejemplosresta

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.pdmproyecto.R
import com.example.pdmproyecto.databinding.FragmentRestaExplicacionDosBinding

/**
 * A simple [Fragment] subclass.
 */
class resta_explicacion_dos : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var binding = DataBindingUtil.inflate<FragmentRestaExplicacionDosBinding>(inflater,
            R.layout.fragment_resta_explicacion_dos, container,false)
        binding.btnNextResta.setOnClickListener {
            //it.findNavController().navigate(R.id.action_resta_explicacion_uno_to_resta_explicacion_dos2)
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
