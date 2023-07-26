package com.kotlinegitim.uygulama

fun main(){
    //Meyve" adlı bir üst sınıf oluşturun ve bu sınıfta meyvelerin
    // adı ve tatlılık derecesi gibi özellikleri tanımlayın. Ardından
    // "Elma" adlı bir alt sınıf oluşturun ve bu sınıfta elmalara özgü
    // özellikleri ekleyin. "Elma" sınıfı "Meyve" sınıfından kalıtım
    // almalıdır. Elma sınıfında "vitaminDegeri" adlı bir özelliği ve
    // "yiyebilir" adlı bir metodu ekleyin.
    val elma = Meyve("elma","4")
    val muz = Meyve("muz","7")


    val meyveler = arrayListOf(elma,muz)
    for (i in meyveler){
    println("Adı :" + i.adi)
    println("Tatlılık derecesi : "+ i.tatlilikDerecesi)
    }

}