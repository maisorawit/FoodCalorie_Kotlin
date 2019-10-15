package buu.informatics.s59160135.foodcalorie


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentActivity
import androidx.navigation.findNavController
import buu.informatics.s59160135.foodcalorie.databinding.FragmentFoodMenuBinding

class FoodMenuFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentFoodMenuBinding>(inflater,
            R.layout.fragment_food_menu, container, false)

        binding.buttonBoil.setOnClickListener{view ->
            view.findNavController().navigate(R.id.action_foodMenuFragment_to_resultFragment)
        }

        binding.buttonStir.setOnClickListener{view ->
            view.findNavController().navigate(R.id.action_foodMenuFragment_to_resultFragment)
        }

        binding.buttonSimmer.setOnClickListener{view ->
            view.findNavController().navigate(R.id.action_foodMenuFragment_to_resultFragment)
        }

        binding.buttonGrill.setOnClickListener{view ->
            view.findNavController().navigate(R.id.action_foodMenuFragment_to_resultFragment)
        }

        return binding.root
    }


}






























