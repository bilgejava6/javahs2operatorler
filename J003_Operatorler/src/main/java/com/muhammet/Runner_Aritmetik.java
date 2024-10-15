package com.muhammet;

import java.util.Scanner;

public class Runner_Aritmetik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // sistem girişlerini taramak için
        double sayi1,sayi2,sonuc;
        System.out.println("""
                ******************************
                ***** ARİTMETİK İŞLEMLER *****
                ******************************
               
                """);
        System.out.print("Lütfen 1. sayıyı giriniz....: ");
        sayi1 = sc.nextInt();
        System.out.print("Lütfen 2. sayıyı giriniz....: ");
        sayi2 = sc.nextInt();
        sonuc = sayi1+sayi2;
        System.out.println("iki sayının toplamı...: "+ sonuc);
        sonuc = sayi1-sayi2;
        System.out.println("iki sayının farkı...: "+ sonuc);
        sonuc = sayi1/sayi2;
        System.out.println("iki sayının bölümü...: "+ sonuc);
        sonuc = sayi1*sayi2;
        System.out.println("iki sayının çarpımı...: "+ sonuc);
        sonuc = sayi1%sayi2;
        System.out.println("iki sayının modu...: "+ sonuc);
    }
}
