package ders15_overloading_whileLoop;

import java.util.Scanner;

public class C04_WhileLoop {
    public static void main(String[] args) {

        // Kullanıcıdan toplamak üzere tamsayılar alın
        // kullanıcı 0'a basarsa, sayı alma işlemini bitirin.
        // kullanıcının kaç sayı girdiğini ve bu sayıların toplamının kaç olduğunu yazdırın.


        Scanner scanner = new Scanner(System.in);
        int girilenSayi = 5;  // Verilen ilk değer bu soru için sıfır olmamalı, çünkü 0 loop'u bitirmek için kullanılacak.
        int sayac = 0;
        int toplam = 0;

        while (girilenSayi != 0){
            System.out.println("Lütfen toplamak için tamsayı girin" + "\n Bitirmek için 0'a basınız.");
            girilenSayi = scanner.nextInt();


            if (girilenSayi !=0){
                sayac ++ ;
                toplam = toplam + girilenSayi;
            }

        }

        System.out.println("Girilen " + sayac + " adet sayının toplamı: " + toplam );


    }
}
