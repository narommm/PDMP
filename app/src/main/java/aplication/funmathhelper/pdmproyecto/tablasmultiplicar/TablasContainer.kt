package aplication.funmathhelper.pdmproyecto.tablasmultiplicar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.pdmproyecto.R
import com.example.pdmproyecto.databinding.FragmentElegirTablaDeMultiplicarBinding
import com.example.pdmproyecto.databinding.FragmentTablasBinding

/**
 * A simple [Fragment] subclass.
 */
class TablasContainer : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentTablasBinding>(inflater,R.layout.fragment_tablas,container,false)
        //return inflater.inflate(R.layout.fragment_tablas, container, false)

        when(TablasChoice.tabla){
            1->binding.tablas.setBackgroundResource(R.drawable.tabla_uno)
            2->binding.tablas.setBackgroundResource(R.drawable.tabla_dos)
            3->binding.tablas.setBackgroundResource(R.drawable.tabla_tres)
            4->binding.tablas.setBackgroundResource(R.drawable.tabla_cuatro)
            5->binding.tablas.setBackgroundResource(R.drawable.tabla_cinco)
            6->binding.tablas.setBackgroundResource(R.drawable.tabla_seis)
            7->binding.tablas.setBackgroundResource(R.drawable.tabla_siete)
            8->binding.tablas.setBackgroundResource(R.drawable.tabla_ocho)
            9->binding.tablas.setBackgroundResource(R.drawable.tabla_nueve)

        }

        return binding.root
    }

}
