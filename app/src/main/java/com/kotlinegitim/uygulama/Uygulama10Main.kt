package com.kotlinegitim.uygulama


fun main(){
    //Bir "Hayvan" adlı üst sınıf oluşturun ve bu
    // sınıfta hayvanların ses çıkarma özelliği için "sesCikar"
    // adında bir metot tanımlayın. Ardından "Kedi" ve "Kopek" adlı
    // iki alt sınıf oluşturun. Her bir alt sınıf, "sesCikar" metotunu
    // kendi türüne uygun şekilde ezerek (override ederek) kendi sesini
    // çıkartsın. Sonrasında bir "HayvanBarinagi" adlı sınıf oluşturun ve
    // bu sınıfta "sesCikar" metodu parametre olarak aldığı hayvan nesnesini
    // çağırarak hayvanın sesini çıkartsın. Polymorphism özelliğini kullanarak
    // bu sınıfları nasıl bir arada kullanabilirsiniz?

    val hayvanBarinak = HayvanBarinagi()
    hayvanBarinak.sesVer()
    val kedi:Hayvan = Kedi()
    kedi.sesVer()
    val kopek:Hayvan = Kopek()
    kopek.sesVer()
}