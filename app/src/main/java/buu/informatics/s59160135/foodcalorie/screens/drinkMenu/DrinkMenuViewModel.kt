package buu.informatics.s59160135.foodcalorie.screens.drinkMenu

import androidx.lifecycle.ViewModel

class DrinkMenuViewModel:ViewModel() {

    var type = ""
    var status = 0

    var drinkList = arrayOf(
        "juice",
        "soda",
        "coffee",
        "alcohol"
    )

    fun checkType(){
        if(status == 1){ type = drinkList[0]}
        if(status == 2){ type = drinkList[1]}
        if(status == 3){ type = drinkList[2]}
        if(status == 4){ type = drinkList[3]}
    }

}