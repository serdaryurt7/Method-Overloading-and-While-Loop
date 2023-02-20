package ders15_overloading_whileLoop;

import java.util.Scanner;

public class C05_WhileLoop {
    public static void main(String[] args) {

        // Kullanıcıdan toplanmak üzere sayı alın, sayıların toplamı 500 ve 500 ü geçerse,
        // girilen sayı adedi, girilen sayıların toplamını yazdırın. "Bu kadar yeter" yazdırın :)


        Scanner scanner = new Scanner(System.in);

        double toplam = 0;
        int sayac = 0;
        double girilenSayi = 0;

        while (toplam<500){

            girilenSayi = scanner.nextDouble();
            toplam += girilenSayi;
            sayac++;
        }

        System.out.println("Girilen sayı adedi " + sayac + " sayıların toplamı: " + toplam + " oldu bu kadar yeter :)");

    }
}

      // Bir loop'un kaç kere çalışacağı belli değilse,
      // veya bitiş şartı loop değişkenine değil,
      // başka bir değişkene bağlı ise while loop daha kullanışlı olacaktır.


     // Örneğin kullanıcıdan şifre istiyorsak ve yanlış giriş olduğu müddetçe tekrar istememiz gerekiyorsa
     // adım sayısını bilmemiz mümkün olmadığından while loop tercih edilebilir.