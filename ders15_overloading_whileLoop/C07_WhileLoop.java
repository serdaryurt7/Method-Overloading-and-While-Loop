package ders15_overloading_whileLoop;

public class C07_WhileLoop {
    public static void main(String[] args) {

        // Kullanıcıdan bir sayı ve hesaplamak istediği üssünü isteyin.
        // While loop kullanarak verilen sayının istenen üssünü hesaplayıp yazdıran bir method oluşturun.

        int sayi = 3;
        int us = 4;

        usHesapla(sayi,us);

    }

    public static void usHesapla(int sayi, int us){

        int sonuc = 1;

        while (us>0){

            sonuc = sonuc * sayi;

            us--;

        }

        System.out.println(sonuc);

    }
}
