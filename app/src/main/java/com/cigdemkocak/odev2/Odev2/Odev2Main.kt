package com.cigdemkocak.odev2

import com.cigdemkocak.odev2.Odev2.Odev2

fun main() {
    val f = Odev2()

    val soru1Sonuc = f.soru1(35.0)
    println("1. Sorunun Sonucu: ${soru1Sonuc}")

    f.soru2(5,4)

    val soru3Sonuc = f.soru3(4)
    println("3. Sorunun Sonucu: ${soru3Sonuc}")

    f.soru4("Hello",'l')

    val soru5Sonuc = f.soru5(5)
    println("5. Sorunun Sonucu: ${soru5Sonuc}")

    val soru6Sonuc = f.soru6(30)
    println("6. Sorunun Sonucu: ${soru6Sonuc}")

    val soru7Sonuc = f.soru7(55)
    println("7. Sorunun Sonucu: ${soru7Sonuc}")


}