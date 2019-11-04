package buu.informatics.s59160135.foodcalorie


import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentActivity
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import buu.informatics.s59160135.foodcalorie.databinding.FragmentFoodMenuBinding
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_food_menu.*

class FoodMenuFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentFoodMenuBinding>(
            inflater,
            R.layout.fragment_food_menu, container, false
        )

        binding.apply {

            buttonBoil.setOnClickListener {
                goToIngrediantPage()
            }

            buttonStir.setOnClickListener {
                goToIngrediantPage()
            }

            buttonSimmer.setOnClickListener {
                goToIngrediantPage()
            }

            buttonGrill.setOnClickListener {
                goToIngrediantPage()
            }
        }

        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var snack = view?.let { Snackbar.make(it, "เมนูอาหาร", Snackbar.LENGTH_LONG) }
        snack?.show()

//        val toast = Toast.makeText(context, "เมนูอาหาร", Toast.LENGTH_LONG)
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
            .putExtra(Intent.EXTRA_TEXT, getString(R.string.share_message, ""))
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
        val action = FoodMenuFragmentDirections.actionFoodMenuFragmentToResultFragment(
            grill = textView_grill.text.toString(),
            boil = textView_boil.text.toString(),
            simmer = textView_simmer.text.toString(),
            stir = textView_stir.text.toString()
        )
        NavHostFragment.findNavController(this).navigate(action)

    }


}
































