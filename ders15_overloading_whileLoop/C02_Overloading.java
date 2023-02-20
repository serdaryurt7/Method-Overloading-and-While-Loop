package ders15_overloading_whileLoop;

public class C02_Overloading {

    public static void main(String[] args) {

        carpim(3,5);  // Method call sırasında, method parantezine yazılanlara argument denir. Yani 3,5
        carpim(3.4,2);   // double - Integer iki sayinin çarpımı 6.8
    }
         // Bir class'ta aynı isim ve aynı signature'a sahip iki method olmaz.

         // Method overloading olan classlarda java hangi methodun çalışacağına şu şekilde karar verir

        // 1- Önce method ismine bakar
        // 2- argument sayısı ve parametre sayısına bakar
        // 3- argument ve parametre uyumuna bakar
        // 4- minimum casting (yani 3,5 e en yakın veri türü int - int)


    public static void carpim(int sayi1, int sayi2){               // Çarpım int-int

        System.out.println("Iki Integer sayının çarpımı: " + sayi1*sayi2);

    }

    public static void carpim(int sayi3, int sayi4,int sayi5){     // Çarpım int-int-int

        System.out.println("Uc Integer sayının çarpımı: " + sayi3*sayi4*sayi5);

    }

    public static void carpim(double sayi1, int sayi2){            // Çarpım double-int

        System.out.println("Double ve Integer sayının çarpımı: " + sayi1*sayi2);

    }

    public static void carpim(int sayi1, double sayi2){            // Çarpım int-double

        System.out.println("Double ve Integer sayının çarpımı: " + sayi1*sayi2);

    }

    public static void carpim(double sayi1, double sayi2){         // Çarpım double-double

        System.out.println("Double ve Integer sayının çarpımı: " + sayi1*sayi2);

    }

}
