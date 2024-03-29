package buu.informatics.s59160135.foodcalorie.screens.home


import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import buu.informatics.s59160135.foodcalorie.R
import buu.informatics.s59160135.foodcalorie.databinding.FragmentHomeBinding

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentHomeBinding>(
            inflater,
            R.layout.fragment_home, container, false
        )
        binding.apply {
            buttonFood.setOnClickListener { view ->
                view.findNavController().navigate(R.id.action_homeFragment_to_foodMenuFragment)
            }
            buttonDrink.setOnClickListener { view ->
                view.findNavController().navigate(R.id.action_homeFragment_to_drinkMenuFragment)
            }
        }
        setHasOptionsMenu(true)
        return binding.root
    }
//    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
//        super.onCreateOptionsMenu(menu, inflater)
//        inflater?.inflate(R.menu.options_menu, menu)
//    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item!!,
            view!!.findNavController()) || super.onOptionsItemSelected(item)
    }

    override fun onStart() {
        super.onStart()
        Log.i("Start","Start")
    }

}
