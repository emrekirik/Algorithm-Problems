package com.kotlinegitim.uygulama

fun main(){
    //Bir sayının faktöriyelini hesaplayan bir fonksiyonu nasıl oluşturursunuz?
    fun main() {
        val number = 5
        val fact_sonuc = (1..number).fold(1, Int::times)
        println("$number! = $fact_sonuc")
    }


}