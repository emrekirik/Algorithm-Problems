package com.kotlinegitim.uygulama

import java.util.Scanner

fun main(){
    //Kullanıcının girdiği bir sayıyı ondalıklı sayıya dönüştüren bir programı nasıl yazarsınız?

    println("Ondalıklı sayıya dönüştürmek istediğiniz tam sayıyı girin:")
    val girilenSayi = readLine()

    try {
        val ondalikliSayi = girilenSayi?.toInt()?.toDouble()
        println("Ondalıklı Sayı: $ondalikliSayi")
    } catch (e:Exception) {
        println("Hatalı giriş! Lütfen geçerli bir tam sayı girin.")
    }
}