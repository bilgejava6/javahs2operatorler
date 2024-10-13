package com.muhammet;

public class Runner_DegiskenTurleri {
    public static void main(String[] args) {
        /**
         * Değişken Türleri
         * 1- primitive data dtypes - İlkel Veri türleri
         * 1.1- Sayısal Veri Türleri
         * 1.1.1- Tam Sayı türleri
         * 1.1.1.1- byte: 8 adet kutucuk (8 bit)-> 2^8 => 256 adet sayı
         * 1.1.1.2- short: 16 adet kutucuk (16 bit) -> 2^16 => 65536 adet sayı
         * 1.1.1.3- int:(integer) 32 adet kutucuk (32 bit) -> 2^32 =>
         * NOT: her dilin default değerleri ve değişkenleri bulunur. sayısal tam sayı değeri için
         * Java da default tanım int dir.
         * Eğer bir sayısal işlem yapılıyor ise, ya da sayısal bir değer yazdırılmak isteniyor
         * ise bu değer mutlaka bellekte adreslenmek zorunda. Bu nedenle sayısal tam sayı değeri
         * integer olarak işaretlenir ve bellekte yer tutar.
         * 1.1.1.4- long: 64 adet kutucuk (64 bit) -> 2^64, int uzunluğu dışında kalan sayısal
         * ifadeleri long olarak tanımlamak için sonuna "L" harfi getirmeliyiz.
         * 2- references data types - Referans(Nesne) veri türleri
         */
        byte byte_degiskeni;
        // değişkene değer atamak: [değişkenin adı] = [atanacak değer] ;
        byte_degiskeni = 90;
        System.out.println("Byte.....: "+ byte_degiskeni);
        byte_degiskeni = 0;
        System.out.println("Byte.....: "+ byte_degiskeni);
        short short_sayi = 32000;
        int int_sayi = 2012111110;

        System.out.println("Bir sayı tut Aklından....: " + (85 + 5));

        long long_uzun_tam_sayi = 98000000000L;

    }
}
