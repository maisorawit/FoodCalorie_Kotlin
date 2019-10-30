package buu.informatics.s59160135.foodcalorie


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import buu.informatics.s59160135.foodcalorie.databinding.FragmentDrinkMenuBinding
import buu.informatics.s59160135.foodcalorie.databinding.FragmentFoodMenuBinding
import com.google.android.material.snackbar.Snackbar

class DrinkMenuFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentDrinkMenuBinding>(inflater,
            R.layout.fragment_drink_menu, container, false)

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
