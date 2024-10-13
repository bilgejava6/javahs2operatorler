package com.muhammet;


import java.util.Scanner;

public class Runner {
    /**
     * Class içerisinde,
     * 1- değişken tanımlama
     * 2- method tanımlama
     * 3- inner class (iç sınıf) tanımlama
     * yapılabilir.
     * Ancak temel kodlamalar class gövdesi içerisinde yapılamaz.
     * kodlamalar method ların gövdelerinde yazılır.
     * (if, for, nesnelerin kullanımı v.s)
     */
    public static void main(String[] args) {
        //1. out kodlaması
        System.out.println("Merhaba Java");
        System.out.println(987);
        // print & println
        System.out.print("Merhaba bu gün hava güzel. ");
        System.out.print("Yine java yazıyoruz. ");
        System.out.print("Algoritmalar devam edecek. :)");
        System.out.println();
        //2. input kullanıcıdan bilgi almak
        //tanımlama yap.
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen 1 sayı giriniz.....: ");
        sc.nextInt();
    }

}
