package buu.informatics.s59160135.foodcalorie.screens.foodMenu


import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.NavHostFragment
//import buu.informatics.s59160135.foodcalorie.FoodMenuFragmentDirections

import buu.informatics.s59160135.foodcalorie.R
import buu.informatics.s59160135.foodcalorie.databinding.FragmentFoodMenuBinding
import com.google.android.material.snackbar.Snackbar

class FoodMenuFragment : Fragment() {

    lateinit var viewModel: FoodMenuViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentFoodMenuBinding>(
            inflater,
            R.layout.fragment_food_menu, container, false
        )
        viewModel = ViewModelProviders.of(this).get(FoodMenuViewModel::class.java)

        binding.apply {
            buttonBoil.setOnClickListener {
                viewModel.status = 1
                goToResult()
            }
            buttonStir.setOnClickListener {
                viewModel.status = 2
                goToResult()
            }
            buttonSimmer.setOnClickListener {
                viewModel.status = 3
                goToResult()
            }
            buttonGrill.setOnClickListener {
                viewModel.status = 4
                goToResult()
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

    private fun goToResult() {
        viewModel.checkType()
        val action =
            FoodMenuFragmentDirections.actionFoodMenuFragmentToResultFragment(
                type = viewModel.type
            )
        NavHostFragment.findNavController(this).navigate(action)
    }

}
































