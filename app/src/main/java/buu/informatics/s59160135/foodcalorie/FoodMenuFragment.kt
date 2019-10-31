package buu.informatics.s59160135.foodcalorie


import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
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


}
































