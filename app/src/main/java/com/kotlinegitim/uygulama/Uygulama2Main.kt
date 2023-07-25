package com.kotlinegitim.uygulama

import kotlin.math.sqrt

fun main(){

    // Bir sayının asal sayı olup olmadığını bulma

    if (asalMi(14)){
        println("asal")
    }else{
        println("asal değil")
    }
}

fun asalMi(sayi: Int): Boolean {
    if (sayi < 2) return false

    for (i in 2..(sqrt(sayi.toDouble()).toInt())) {
        if (sayi % i == 0) {
            return false
        }
    }
    return true
}

