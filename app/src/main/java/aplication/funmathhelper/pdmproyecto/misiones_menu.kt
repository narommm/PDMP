package aplication.funmathhelper.pdmproyecto

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.pdmproyecto.R
import com.example.pdmproyecto.databinding.FragmentMisionesMenuBinding

/**
 * A simple [Fragment] subclass.
 */
class misiones_menu : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var binding = DataBindingUtil.inflate<FragmentMisionesMenuBinding>(inflater,
            R.layout.fragment_misiones_menu, container,false)
        binding.misionesNivel1.setOnClickListener{
            it.findNavController().navigate(R.id.action_misiones_menu_to_nivel_bajo_pregunta_3)
        }
        binding.misionesNivel2.setOnClickListener{
            it.findNavController().navigate(R.id.action_misiones_menu_to_multiplicacionMedia)
        }
        binding.misionesNivel3.setOnClickListener{
            it.findNavController().navigate(R.id.action_misiones_menu_to_divisionSimple)
        }
        binding.misionesNivel4.setOnClickListener{
            it.findNavController().navigate(R.id.action_misiones_menu_to_divisionDoble)
        }
        return binding.root
    }

}
