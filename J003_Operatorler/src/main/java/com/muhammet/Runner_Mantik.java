package com.muhammet;

public class Runner_Mantik {
    public static void main(String[] args) {
        /**
         * Durumların birden fazla idelenmesi gerekli olduğu zamanlarda kullanılır.
         * && -> Ve, relational birleştirmelerde tüm ilişkilerin doğru olmasını bekleriz.
         * || -> veya, ilişkilerden bir tanesi bile doğru olsa sonuç true çıkar.
         */
        String ka = "muhammet", sf = "12345";

        System.out.println("kullanıcı adı doğru mudur?"+ (ka=="muhammet"));
        System.out.println("şifre  doğru mudur?"+ (sf=="12345"));

        System.out.println("kullanıcı adı ve şifre doğru mudur? "+ (ka=="muhammet" && sf=="12345")); // true
        System.out.println("kullanıcı adı ve şifre doğru mudur? "+ (ka=="Muhammet" && sf=="12345")); // false
        System.out.println("kullanıcı adı ve şifre doğru mudur? "+ (ka=="muhammet" && sf=="123456")); // false
        System.out.println("kullanıcı adı ve şifre doğru mudur? "+ (ka=="Muhammet" && sf=="123456")); // false

        String il = "Ankara";
        int yas = 40;
        String cinsiyet = "Kadın";
        // bir sitemiz var, siteye Ankaralı olanlar ya da 40 yaş ve üzeri olanlar ya da kadın olanlar girebilir.
        //                                                   true    ya da   false   ya da        false
        System.out.println("Ankaralı 20 yaşında erkek "+ (il=="Ankara" ||   20>=yas   ||    cinsiyet=="Erkek")); // true
        //                                               false            true               false
        System.out.println("İzmir 40 yaşında erkek "+ (il=="İzmir" ||   40>=yas   ||    cinsiyet=="Erkek")); // true
        //                                                 false          false             false
        System.out.println("Bursa 39 yaşında erkek "+ (il=="Bursa" ||   39>=yas   ||    cinsiyet=="Erkek")); // false

        /**
         * ilişkisel ve mantık operartröleri ile kullanılan ilişkisel sorgulamalarda ortaya çıkan sonuç için,
         * bir atama yapmanız istenseydi sonucu hangi değişkene atardınız?
         *
         * boolean -> 1 bitlik - true/false
         * boolean isAnkara = true;
         * = operatörü görevi, sağ taraftaki değeri değişkene atamak
         * Ankara == Ankara => true
         */
        // Datatype   DataName     Atama          Value
           boolean    isAnkara       =          il=="Ankara";
        System.out.println("Ankara mı? "+ isAnkara);

        yas = 16;
        cinsiyet = "Erkek";
        // yaşı 15+ olanlar ve Erkek olanlar giriş yapabilir.
        boolean isLogin;
        //   Değişken     Atama         true ve true => true
            isLogin         =        yas>=15 && cinsiyet=="Erkek";
        System.out.println("Giriş yaptı mı? "+ isLogin);

        /**
         * Kurallar, bir sınavdan ortalama 60 ve üzeri alanlar geçecektir. Ancak
         * öğretmen 5. soruyu yapanların direkt geçebileceklerini söylemiştir. Buna göre
         * aşağıda verilen bilgiler ışığında kodlamayı yazınız.
         *
         */
        int ortalamaOlmasiGereken = 60;
        boolean besinciSoruyuYaptiMi= true;

        int ogrenci_1_notu = 67;
        int ogrenci_2_notu = 54;
        boolean ogrenciBesinciSoruCevabi = true;
        int ortalama = (ogrenci_1_notu + ogrenci_2_notu) /2 ;
        boolean sonuc = ortalama>=ortalamaOlmasiGereken || ogrenciBesinciSoruCevabi==besinciSoruyuYaptiMi;

        System.out.println("Öğrenci geçti mi? "+ sonuc);




    }
}
