package com.muhammet;

public class Runner_arttirim_eksiltim {
    public static void main(String[] args) {
        /**
         * ++ -> bir değişkenin değerini 1 arttırmak için
         * -- -> bir değişkenin değerini 1 eksiltmek için
         * -------
         * prefix, suffix (önde, sonda kullanım)
         * eğer ++,-- değişkenin sonunda tanımlanır ise, önce değişken sonra işlem gerçekleşir
         * eğer ++,-- değişkenin önünde tanımlanır ise, önce işlem gerçekleşir sonra değer
         */
        int sayi = 1;
        System.out.println("sayinin değeri....: "+ sayi);
        sayi = sayi + 1;
        System.out.println("sayinin değeri....: "+ sayi);
        sayi += 1;
        System.out.println("sayinin değeri....: "+ sayi);
        sayi++; // sonda kullanım
        System.out.println("sayinin değeri....: "+ sayi);
        ++sayi; // önde kullanım
        System.out.println("sayinin değeri....: "+ sayi);
        sayi--;
        System.out.println("sayinin değeri....: "+ sayi);
        --sayi;
        System.out.println("sayinin değeri....: "+ sayi);

        int toplam= 10;
        System.out.println("Toplam....: "+ toplam);
        System.out.println("Sayi......: "+ sayi);

        toplam = sayi++;
        System.out.println("Toplam....: "+ toplam); // 4, 3, 4
        System.out.println("Sayi......: "+ sayi);   // 4, 4, 3

        int s1=6,s2=8,s3=-2; // s1=6, s2=10, s3=-1
        //        6   +   9  +  -1  - (-1) -  6   +  -2  +  9
        toplam = s1++ + ++s2 + ++s3 - s3-- - --s1 + s3++ + s2++; // 17+, 7, 9, 13, 16,
        System.out.println("Toplam....: "+ toplam);
        System.out.println("s1........: "+ s1); // 6
        System.out.println("s2........: "+ s2); // 10
        System.out.println("s3........: "+ s3); // -2

    }
}
