package buu.informatics.s59160135.foodcalorie.screens.result


import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import buu.informatics.s59160135.foodcalorie.R
//import buu.informatics.s59160135.foodcalorie.ResultFragmentArgs
import buu.informatics.s59160135.foodcalorie.databinding.FragmentResultBinding
import buu.informatics.s59160135.foodcalorie.screens.foodMenu.FoodMenuViewModel

/**
 * A simple [Fragment] subclass.
 */
class ResultFragment : Fragment() {

    lateinit var viewModel: ResultViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var binding = DataBindingUtil.inflate<FragmentResultBinding>(
            inflater,
            R.layout.fragment_result, container, false
        )

        viewModel = ViewModelProviders.of(this).get(ResultViewModel::class.java)

        var args = ResultFragmentArgs.fromBundle(arguments!!)
        val adapter = ResultAdapter()

        if (args.type == "stir") {
            adapter.replaceItems(viewModel.itemsStir)
        }
        if (args.type == "simmer") {
            adapter.replaceItems(viewModel.itemsSimmer)
        }
        if (args.type == "boil") {
            adapter.replaceItems(viewModel.itemsBoil)
        }
        if (args.type == "grill") {
            adapter.replaceItems(viewModel.itemsGrill)
        }
        if (args.type == "soda") {
            adapter.replaceItems(viewModel.itemsSoda)
        }
        if (args.type == "coffee") {
            adapter.replaceItems(viewModel.itemsCoffee)
        }
        if (args.type == "alcohol") {
            adapter.replaceItems(viewModel.itemsAlcohol)
        }
        if (args.type == "juice") {
            adapter.replaceItems(viewModel.itemsJuice)
        }

        binding.recycleview.adapter = adapter

        setHasOptionsMenu(true)
        return binding.root
    }

    // Creating our Share Intent
    private fun getShareIntent(): Intent {
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


}
