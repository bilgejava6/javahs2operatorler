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
         * 1.1.2- Ondalıklı Sayı Türleri
         * 1.1.2.1- float: 32 bit
         * 1.1.2.2- double: 64 bit
         * 1.2- Karakter Veri Türü
         * 1.2.1- char
         * NOT: her dilin default değerleri ve değişkenleri bulunur. sayısal tam sayı değeri için
         * Java da default tanım int dir.
         * Eğer bir sayısal işlem yapılıyor ise, ya da sayısal bir değer yazdırılmak isteniyor
         * ise bu değer mutlaka bellekte adreslenmek zorunda. Bu nedenle sayısal tam sayı değeri
         * integer olarak işaretlenir ve bellekte yer tutar.
         * 1.1.1.4- long: 64 adet kutucuk (64 bit) -> 2^64, int uzunluğu dışında kalan sayısal
         * ifadeleri long olarak tanımlamak için sonuna "L" harfi getirmeliyiz.
         * 2- references data types - Referans(Nesne) veri türleri
         * 2.1 String: metinsel ifadeleri içeren değişken türümüz, karakterler dizi olarak adlandırılır.
         */
        byte byte_degiskeni;
        // değişkene değer atamak: [değişkenin adı] = [atanacak değer] ;
        byte_degiskeni = 90;
        byte_degiskeni = 5+9;
        System.out.println("Byte.....: "+ byte_degiskeni);
        byte_degiskeni = 0;
        System.out.println("Byte.....: "+ byte_degiskeni);
        short short_sayi = 32000;
        int int_sayi = 2012111110;

        System.out.println("Bir sayı tut Aklından....: " + (85 + 5));

        long long_uzun_tam_sayi = 98000000000L;
        /**
         * DİKKAT!!!!!
         * Daha büyük aynı tür değişkenler alt türlerini kapsar. Değer atanabilir.
         * Ancak alt türler üst dğeişken türlerine direkt atanamazlar.
         * ****** ANCAK, illede atamak istiyorum derseniz ne olacak?
         * alt türleri üst türlere yüklemeye zorlamak için CAST işlemi yaparız.
         * TANIM=> [alt değişken] = ([alt değişken türü]) [üst değişken]
         */
        int yeniSayi = 54000;
        long yeniUzunSayi= 6000;
        byte yeniByte=1;
        //yeniUzunSayi = yeniSayi;
        yeniByte = (byte) yeniUzunSayi;
        System.out.println("Cast edilmiş Byte değeri => "+ yeniByte);

        int saniye = 1000; // ms
        int dakika = saniye * 60 ;
        int saat = dakika * 60;
        int gun = saat * 24;
        int ay = gun * 30;
        int yil = ay * 12;
        long yas = yil * 41L;
        System.out.println("ben doğalı  kaç ms olmuş? "+ yas);
        /**
         * Değişken Tanımlarken DİKKAT!!!!
         *
         */
        int degiskenInt;
        int degisken_Int;
        int degisken2;
        int i2;
        // int 2i;değişkenler sayı ile başlamaz
        // int i_Sayisi*; değişken adında özel karakter olmaz
        // int sayi degiskeni; değişken adında boşluk karakteri olamaz
        // int sayi-degisken; (-) işareti kullanamazsınız.
        // int türkçeDeğişkenYazmayın; türkçe karakter kullanmayın.
        byte PI;
        byte degiskenTanimlama; // default kullanım
        byte newConnectionString;
        byte DegiskenTanimlama;
        /**
         * NOT!!! Bir değişken adını tekrar tanımlayamazsınız.
         */
        // int sayi33;
        // byte sayi33;
        byte degiskentanimlama;
        byte degisken_tanimlama;

        int toplamPara = 3_568_987;
        System.out.println("toplam para....: "+ toplamPara);
        long iban = 10_5435_5444_5438_5004L;
        int sayyi = 5_43_36;
        int sayi = 54_336;

        //-----------------------
        float ondalikli_sayi = 35_000.54F; // F f

        int digerSayi = 5;
        float digerOndalik = digerSayi;
        System.out.println("diğer ondalık sayı....: "+ digerOndalik);

        digerOndalik = 65.99f;
        digerSayi = (int)digerOndalik;
        System.out.println("diğer tam sayı....: "+ digerSayi);

        double buyukOndalikSayi = 9_000_000_000_000_000.2_342_324_324_234_234;//d, D
        /**
         * NOT: Tüm ilkel veri türlerimizin kapsayıcı sınıfları bulunur (Wrapper Class)
         * bu sınıflar bu tipleri daha kolay yönetmek ve uygulama aşamasında kolaylık
         * sağlamak için kullanılırlar.
         * byte -> Byte
         * short -> Short
         * int -> Integer
         * float -> Float
         */
        System.out.println("byte min değer.....: "+ Byte.MIN_VALUE);
        System.out.println("byte min değer.....: "+ Byte.MAX_VALUE);
        System.out.println("long min değer.....: "+ Long.MIN_VALUE);
        System.out.println("long min değer.....: "+ Long.MAX_VALUE);
        System.out.println("double min değer.....: "+ Double.MIN_VALUE);
        System.out.println("double min değer.....: "+ Double.MAX_VALUE);


        char karakterDegiskeni;
        karakterDegiskeni = 'A'; // karakterin kenidisi tek tırnak içinde atanabilir.
        System.out.println("karakter......: "+ karakterDegiskeni);
        karakterDegiskeni = 66; // karakter değerini sayısal olarakta atayabilirsiniz.
        System.out.println("karakter......: "+ karakterDegiskeni);
        karakterDegiskeni = '6';
        System.out.println("karakter......: "+ karakterDegiskeni);
        System.out.println("karakter......: "+ (int)karakterDegiskeni);

        System.out.println("karakter......: "+karakterDegiskeni+5);
        System.out.println("karakter......: "+(karakterDegiskeni+5));

        // karakterler ile adınızı ekrana yazdırın
        System.out.print('M');
        System.out.print('u');
        System.out.print('h');
        System.out.print('a');
        System.out.print('m');
        System.out.print('m');
        System.out.print('e');
        System.out.print('t');
        System.out.println();
        String ad = "Muhammet";
        System.out.println("adınız.....: "+ ad);

        /**
         * boolean
         * Bir durumu tespit etmekte, anahtar yapılı akışlarda sıklıkla
         * kullanılan özel bir değişkenimiz
         * boolean -> 1 bit lik değeri ile bir çok alanda kullanılmaktadır.
         * 1 Bit -> 0-1 değer / evet-hayır / doğru-yanlış / true-false
         */
        boolean booleanDegiskeni = true; // Evet, Doğru
        booleanDegiskeni = false; // Hayır, Yanlış

        byte isActive = 1; // 0-> pasif, 1-> aktif -> 8bit
        char isActiveChar = 'E'; // E-> evet, H->hayır -> 8bit
        boolean isActiveBoolean = true; // -> 1 bit
    }
}
