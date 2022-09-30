package com.cigdemkocak.odev2.Odev2


open class Odev2 {
    fun soru1(derece : Double) : Double{
        val fahrenhiet = derece * 1.8 + 32
        return fahrenhiet
    }

    fun soru2(kisaKenar: Int,uzunKenar: Int ){
        val cevre = (kisaKenar + uzunKenar)* 2
        println("2. Sorunun Sonucu: ${cevre}")
    }

    fun soru3(sayi : Int) :Int{
        var factorial = 1
        for(i in 1..sayi){
            factorial *= i
        }
        return factorial
    }

    fun soru4(kelime:String, harf: Char) {
        val kelime = kelime.lowercase()
        var sayac = 0
        for(i in kelime){
            if(i == harf){
                sayac++
            }
        }
        println("4. Sorunun Sonucu: ${sayac}")
    }

    fun soru5(n: Int) :Int{
        val icAcilarToplami = (n-2)*180
        return icAcilarToplami
    }

    fun soru6(gun : Int): Int{
        var maas =0
        val saat = gun*8
        if(saat > 160 ){
            val mesaiSaati = saat - 160
            maas = 160*10 + (mesaiSaati*20)
        }else {
            maas = saat*10
        }
        return maas
    }

    fun soru7(kota:Int) : Int{
        var ucret = 0
        if(kota > 50){
            val asilanMiktar = kota - 50
            ucret = 100+(asilanMiktar*4)

        }else{
            ucret= 100
        }
        return ucret
    }
}