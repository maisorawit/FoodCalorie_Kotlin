package buu.informatics.s59160135.foodcalorie


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentActivity
import androidx.navigation.findNavController
import buu.informatics.s59160135.foodcalorie.databinding.FragmentFoodMenuBinding
import com.google.android.material.snackbar.Snackbar

class FoodMenuFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentFoodMenuBinding>(inflater,
            R.layout.fragment_food_menu, container, false)

        binding.apply {
            buttonBoil.setOnClickListener{view ->
                view.findNavController().navigate(R.id.action_foodMenuFragment_to_resultFragment)
            }

            buttonStir.setOnClickListener{view ->
                view.findNavController().navigate(R.id.action_foodMenuFragment_to_resultFragment)
            }

            buttonSimmer.setOnClickListener{view ->
                view.findNavController().navigate(R.id.action_foodMenuFragment_to_resultFragment)
            }

            buttonGrill.setOnClickListener{view ->
                view.findNavController().navigate(R.id.action_foodMenuFragment_to_resultFragment)
            }
        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var snack = view?.let { Snackbar.make(it, "เมนูอาหาร", Snackbar.LENGTH_LONG) }
        snack?.show()

//        val toast = Toast.makeText(context, "เมนูอาหาร", Toast.LENGTH_LONG)
//        toast.show()
    }

}






























