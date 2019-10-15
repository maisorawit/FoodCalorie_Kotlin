package buu.informatics.s59160135.foodcalorie


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import buu.informatics.s59160135.foodcalorie.databinding.FragmentDrinkMenuBinding
import buu.informatics.s59160135.foodcalorie.databinding.FragmentFoodMenuBinding

class DrinkMenuFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentDrinkMenuBinding>(inflater,
            R.layout.fragment_drink_menu, container, false)
        return binding.root
    }

}
