package buu.informatics.s59160135.foodcalorie.screens.foodMenu

import androidx.lifecycle.ViewModel

class FoodMenuViewModel : ViewModel() {

    var type = ""
    var status = 0

    var foodList = arrayOf(
        "boil",
        "stir",
        "simmer",
        "grill"
    )

    fun checkType(){
        if(status == 1){ type = foodList[0]}
        if(status == 2){ type = foodList[1]}
        if(status == 3){ type = foodList[2]}
        if(status == 4){ type = foodList[3]}
    }

}