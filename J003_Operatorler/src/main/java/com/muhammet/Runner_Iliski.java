package com.muhammet;

import java.util.Scanner;

public class Runner_Iliski {
    public static void main(String[] args) {
        /**
         * İki değişkenin ya da değeri bir birine göre durumunu irdeleyen ve sonuç
         * olarak true/false dönen operatörler.
         * ==       -> iki eşittir operatörü iki değerin bir birine eşitliğini sorgular
         * >, >=    -> iki değişkenden soldakinin sağ taraftakinden büyük ya da büyük eşit olup olmadığını sorgular
         * <, <=    -> iki değişkenden soldakinin sağ taraftakinden küçük ya da küçük eşit olup olmadığını sorgular
         * !        -> değil operatörü, bir sonucu değillemek için kullanılır.
         */
        int ortalama = 69;
        String ka= "muhammet", sf="12345";

        System.out.println("Kullanıcı adı doğru mudur? "+ (ka == "muhammet"));
        System.out.println("Kullanıcı adı doğru mudur? "+ (ka == "Muhammet"));

        System.out.println("Okulu geçti mi?......: "+ (ortalama > 69)); // 69 sayısı 69 dan büyük müdür? hayır
        System.out.println("Okulu geçti mi?......: "+ (ortalama >= 69));// 69 sayısı 69 dan büyük ya da eşit midir? evet

        int kilo = 100;
        System.out.println("Ben kilolu muyum....: "+ (kilo < 100));
        System.out.println("Ben kilolu muyum....: "+ (kilo <= 100));


        System.out.println("""
                1- Toplama
                2- Çıkartma
                3- Çarpma
                4- Bölme
                0- Ç I K I Ş
                """);
        System.out.print("lütfen seçiniz.....: " );
        int secim = new Scanner(System.in).nextInt();
        System.out.println("Seçimiz...: "+secim);
        /**
         * Uygulama devam etsin istiyorsam,
         * secim==1, secim==2, secim==3, secim==4
         */
        System.out.println("Çıkış yaptı mı? "+ (secim==0));
        System.out.println("Çıkış yapmadı mı - Devam etti mi? "+ (secim!=0));



    }
}
