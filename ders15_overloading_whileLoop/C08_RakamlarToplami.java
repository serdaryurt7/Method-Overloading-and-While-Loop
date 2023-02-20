package ders15_overloading_whileLoop;

import java.util.Scanner;

public class C08_RakamlarToplami {
    public static void main(String[] args) {

        // While loop kullanarak kullanıcıdan alınan sayının rakamlar toplamını bulun.

        int sayi = 1453;
        int birlerBasamagi = 0;
        int rakamlarToplami = 0;


        while (sayi != 0){

            birlerBasamagi = sayi % 10;
            rakamlarToplami += birlerBasamagi;
            sayi = sayi / 10;
        }

        System.out.println(rakamlarToplami);

    }
}
