package buu.informatics.s59160135.foodcalorie.screens.result


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

        binding.textMenuu.text = args.type

        val adapter = ResultAdapter()
        adapter.replaceItems(viewModel.items)
        binding.recycleview.adapter = adapter





        return binding.root
    }


}
