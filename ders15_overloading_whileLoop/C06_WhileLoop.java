package ders15_overloading_whileLoop;

import java.util.Scanner;

public class C06_WhileLoop {
    public static void main(String[] args) {

        // Kullanıcıdan şifre isteyin aşağıdaki şartları sağlamayan şifrelerde hataları yazdırıp kullanıcının yeni şifre girmesini isteyin.
        // Geçerli bir şifre yazılıncaya kadar bu işlemi tekrar edin.
        // Geçerli şifre yazılınca "Şifreniz başarı ile kaydedildi" yazdırın.
        // Şartlar: Şifrenin ilk karakteri küçük harf olmalı, - şifrenin son karakteri sayı olmalı, - şifre en az 8 basamaklı olmalı.

        // if ve else ile olursa ikisinden biri çalışır diğeri çalışmaz.
        // farklı ifler olduğu zaman o şartları sağlamak zorunda.


        Scanner scanner = new Scanner(System.in);
        boolean sifreGecerliMi = false;
        String sifre = "";
        int bayrak = 0;

        while (sifreGecerliMi != true){

            System.out.println("Lütfen Şifrenizi Giriniz.");
            sifre = scanner.nextLine();
            bayrak = 0;

            if (!(sifre.charAt(0)>= 'a' && sifre.charAt(0)<='z')){

                System.out.println("Şifrenin ilk karakteri küçük harf olmalı");
                bayrak++;
            }

            if (!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9')){

                System.out.println("Şifrenin son karakteri sayı olmalı");
                bayrak++;
            }

            if (sifre.length() < 8){

                System.out.println("Şifreniz 8 karakterden büyük olmalı");
                bayrak++;
            }

            if (bayrak == 0){

                sifreGecerliMi = true;
                System.out.println("Şifreniz başarı ile kaydedildi.");

            }

        }

    }
}
