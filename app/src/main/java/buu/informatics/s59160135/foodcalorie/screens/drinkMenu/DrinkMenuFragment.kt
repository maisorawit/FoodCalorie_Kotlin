package buu.informatics.s59160135.foodcalorie.screens.drinkMenu


import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import buu.informatics.s59160135.foodcalorie.R
import buu.informatics.s59160135.foodcalorie.databinding.FragmentDrinkMenuBinding
import buu.informatics.s59160135.foodcalorie.screens.foodMenu.FoodMenuFragmentDirections
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

        binding.buttonJuice.setOnClickListener{
            viewModel.status = 1
            goToIngrediantPage()

        }

        binding.buttonSoda.setOnClickListener{
            viewModel.status = 2
            goToIngrediantPage()
        }

        binding.buttonCoffee.setOnClickListener{
            viewModel.status = 3
            goToIngrediantPage()
        }

        binding.buttonAlcohol.setOnClickListener{
            viewModel.status = 4
            goToIngrediantPage()
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

    // Creating our Share Intent
    private fun getShareIntent(): Intent {
//        val args =
//            ResultFragmentArgs.fromBundle(
//                arguments!!
//            )
        val shareIntent = Intent(Intent.ACTION_SEND)
        shareIntent.setType("text/plain")
            .putExtra(Intent.EXTRA_TEXT, getString(R.string.share_message,""))
        return shareIntent
    }

    // Starting an Activity with our new Intent
    private fun shareSuccess() {
        startActivity(getShareIntent())
    }

    // Showing the Share Menu Item Dynamically
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.share_menu, menu)
        // check if the activity resolves
        if (null == getShareIntent().resolveActivity(activity!!.packageManager)) {
            // hide the menu item if it doesn't resolve
            menu.findItem(R.id.share)?.setVisible(false)
        }
    }

    // Sharing from the Menu
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.share -> shareSuccess()
        }
        return super.onOptionsItemSelected(item)
    }


    private fun goToIngrediantPage() {

        viewModel.checkType()
        val action =
            DrinkMenuFragmentDirections.actionDrinkMenuFragmentToResultFragment(
                type = viewModel.type

            )

        NavHostFragment.findNavController(this).navigate(action)

    }


}