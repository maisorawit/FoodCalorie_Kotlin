package buu.informatics.s59160135.foodcalorie


import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import buu.informatics.s59160135.foodcalorie.databinding.FragmentFoodMenuBinding
import buu.informatics.s59160135.foodcalorie.databinding.FragmentResultBinding
import kotlinx.android.synthetic.main.fragment_result.*

/**
 * A simple [Fragment] subclass.
 */
class ResultFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var binding = DataBindingUtil.inflate<FragmentResultBinding>(
            inflater,
            R.layout.fragment_result, container, false
        )

        var args = ResultFragmentArgs.fromBundle(arguments!!)

        Log.i("check", args.grill)

        binding.textMenuu.text = args.grill
        binding.textMenuu.text = args.boil
        binding.textMenuu.text = args.simmer
        binding.textMenuu.text = args.stir


        return binding.root
    }



}
