package com.kotlinegitim.uygulama

fun main(){
    //Bir "Öğrenci" adlı sınıf oluşturun ve öğrencilerin adı,
    // soyadı ve sınıfı gibi özellikleri içeren özellikleri tanımlayın. Ardından, bu sınıftan
    // beş öğrenci nesnesi oluşturun ve bu öğrencilerin
    // özelliklerini ekrana yazdıran bir fonksiyon yazın

    var birinciOgr =ogrenci("Emre", "Kirik",3)
    var ikinciOgr =ogrenci("Selin", "Demirel",3)
    var ucuncuOgr =ogrenci("Emir", "Yağcı",3)
    var dorduncuOgr =ogrenci("Ali", "Pınar",3)
    var besinciOgr =ogrenci("Sezen", "Aksu",3)
    val ogrenciler = arrayOf(birinciOgr, ikinciOgr, ucuncuOgr, dorduncuOgr, besinciOgr)
    for (ogr in ogrenciler) {
        println("${ogr.adi} ${ogr.soyAdi} ${ogr.sinifi}")
    }
}