package com.muhammet;

public class Runner_Gorev {
    /**
     * Class gövdesi içerisinde
     * değişken tanımlanabilir ve atanabilir.
     * method tanımlanabilir
     * inner class tanımlanabilir.
     * ------
     * kodlama ve iş akışlarını yazamazsınız.
     */
    int s1=545,s2=5435;

    public static void main(String[] args) {
        /**
         * Görev opereatörleri bir değişkene başka bir değeri ya da değişken içerisindeki
         * değeri atamak için kullanılırlar. Bazende bir nesnenin referansını değişkene
         * aktarmak için kullanılabilirler.
         * = -> atama görev operatörü,
         * ** UYARI **
         * Local Bir değişken initialize edilmeden kullanılamaz.
         */
        int sayi; // değşiiken tanımlama
        sayi = 5; // değişkene değer atama
        int sayi1=0;
        int sayi2 = 45; // değişkene değer atama ve initialize etmek.
        System.out.println("Sayı Değeri....: "+ 5);
        int toplam = sayi1 + sayi2;
        /**
         * +=, -=, *=, /=, %=
         */
        int vizeNotu = 60;
        int finalNotu = 87;
        // 5 + 9 = 5
        // değişken = yeni değer ataması yapılır

        vizeNotu = vizeNotu + finalNotu;
        System.out.println("vizeNotu: " + vizeNotu);
        vizeNotu += finalNotu;
        System.out.println("vizeNotu: " + vizeNotu);

        int stok = 100;
        int satisAdedi = 4;
        //stok = stok - satisAdedi;
        stok -= satisAdedi;
        System.out.println("stok: " + stok);

        int adet = 5;
        int tekrarSayisi = 3;
        // adet = adet * tekrarSayisi;
        adet *= tekrarSayisi;
        System.out.println("adet sayisi: " + adet);

        adet /= 2;
        System.out.println("adet sayisi: " + adet);

        int mevcutTekrar = 2354;
        mevcutTekrar %= 8;
        System.out.println("mevcutTekrar: " + mevcutTekrar);

    }// end method
}// end class
