package buu.informatics.s59160135.foodcalorie.screens.result

import androidx.lifecycle.ViewModel

class ResultViewModel : ViewModel() {

    val items = listOf(
        MyData("น้ำมะตูม","1 แก้ว","120 Kcal"),
        MyData("น้ำมะนาว","1 แก้ว","100 Kcal่"),
        MyData("น้ำมะพร้าว","1 แก้ว","120 Kcal"),
        MyData("น้ำลำใย","1 แก้ว","100 Kcal"),
        MyData("น้ำส้มคั้น","1 แก้ว","160 Kcal"),
        MyData("น้ำสับปะรด","1 แก้ว","125 Kcal"),
        MyData("น้ำองุ่น","1 แก้ว","112 Kcal"),
        MyData("น้ำอ้อย","1 แก้ว","240 Kcal"),
        MyData("น้ำมะเขือเทศ","1 แก้ว","48 Kcal"),
        MyData("น้ำกระเจี๊ยบ","1 แก้ว","120 Kcal"),
        MyData("น้ำนมข้าวโพด","1 แก้ว","80 Kcal"),
        MyData("น้ำผลไม้รวม","1 กล่อง","100 Kcal"),
        MyData("น้ำผักรวม","1 กล่อง","90 Kcal"),
        MyData("น้ำฝรั่ง","1 กล่อง","100 Kcal")
    )
}