package com.kotlinegitim.uygulama

fun main(){
    val sayilar = ArrayList<Int>()

    for (i in 1..5){
        val sayi = readLine()?.toIntOrNull()
        if (sayi != null) {
            sayilar.add(sayi)
        }
    }

    val toplamHesabi=toplam(sayilar)
    println(toplamHesabi)
}
fun toplam(sayilar:ArrayList<Int>):Int{

    var toplam = 0
    for (i in sayilar){
        toplam = toplam + i
    }
    return toplam


}