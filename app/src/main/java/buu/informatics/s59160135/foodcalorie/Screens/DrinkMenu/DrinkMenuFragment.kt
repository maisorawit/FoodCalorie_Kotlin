package buu.informatics.s59160135.foodcalorie.Screens.DrinkMenu


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import buu.informatics.s59160135.foodcalorie.R
import buu.informatics.s59160135.foodcalorie.databinding.FragmentDrinkMenuBinding
import com.google.android.material.snackbar.Snackbar

class DrinkMenuFragment : Fragment() {

    lateinit var viewModel: DrinkMenuViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentDrinkMenuBinding>(inflater,
            R.layout.fragment_drink_menu, container, false)

        viewModel = ViewModelProviders.of(this).get(DrinkMenuViewModel::class.java)

        binding.buttonJuice.setOnClickListener{view ->
            view.findNavController().navigate(R.id.action_drinkMenuFragment_to_resultFragment)
        }

        binding.buttonSoda.setOnClickListener{view ->
            view.findNavController().navigate(R.id.action_drinkMenuFragment_to_resultFragment)
        }

        binding.buttonCoffee.setOnClickListener{view ->
            view.findNavController().navigate(R.id.action_drinkMenuFragment_to_resultFragment)
        }

        binding.buttonAlcohol.setOnClickListener{view ->
            view.findNavController().navigate(R.id.action_drinkMenuFragment_to_resultFragment)
        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var snack = view?.let { Snackbar.make(it, "เมนูเครื่องดื่ม", Snackbar.LENGTH_LONG) }
        snack?.show()

//        val toast = Toast.makeText(context, "เมนูอาหาร", Toast.LENGTH_SHORT)
//        toast.show()
    }


}
