package buu.informatics.s59160135.foodcalorie


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentActivity
import buu.informatics.s59160135.foodcalorie.databinding.FragmentFoodMenuBinding

/**
 * A simple [Fragment] subclass.
 */
class FoodMenuFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentFoodMenuBinding>(inflater,
            R.layout.fragment_food_menu, container, false)
        return binding.root
    }


}






























