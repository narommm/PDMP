package aplication.funmathhelper.pdmproyecto.ejemplosresta

import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.pdmproyecto.R
import com.example.pdmproyecto.databinding.FragmentRestaExplicacionTresBinding

/**
 * A simple [Fragment] subclass.
 */
class EjemploResta3 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding= DataBindingUtil.inflate<FragmentRestaExplicacionTresBinding>(inflater,R.layout.fragment_resta_explicacion_tres, container, false)
        binding.btnNextResta.setOnClickListener {
            it.findNavController().navigate(R.id.action_resta_explicacion_tres_to_resta_explicacion_cuatro)
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
