package buu.informatics.s59160135.foodcalorie.screens.drinkMenu


import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.NavHostFragment
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

        binding.apply {
            buttonJuice.setOnClickListener{
                viewModel.status = 1
                goToResult()
            }
            buttonSoda.setOnClickListener{
                viewModel.status = 2
                goToResult()
            }
            buttonCoffee.setOnClickListener{
                viewModel.status = 3
                goToResult()
            }
            buttonAlcohol.setOnClickListener{
                viewModel.status = 4
                goToResult()
            }
        }
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var snack = view?.let { Snackbar.make(it, "เมนูเครื่องดื่ม", Snackbar.LENGTH_LONG) }
        snack?.show()

//        val toast = Toast.makeText(context, "เมนูอาหาร", Toast.LENGTH_SHORT)
//        toast.show()
    }

    private fun goToResult() {
        viewModel.checkType()
        val action =
            DrinkMenuFragmentDirections.actionDrinkMenuFragmentToResultFragment(
                type = viewModel.type
            )
        NavHostFragment.findNavController(this).navigate(action)
    }


}
