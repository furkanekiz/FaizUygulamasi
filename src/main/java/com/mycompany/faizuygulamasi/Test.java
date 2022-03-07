package com.mycompany.faizuygulamasi;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        /*Kullanicidan anapara degerini ve parasini kac yil vadeli yatirmak istedigi
        bilgisini alin ve her sene sonunda toplam para miktarini ekrana yazdirin
        
        Faiz orani : %6 
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bankamiza Hosgeldiniz. Faiz Orani %6");

        int anapara, vade;
        System.out.println("Yatirmak istediginiz tutar : ");
        anapara = scanner.nextInt();
        System.out.println("Paranizi kac yil vadeli yatirmak istiyorsunuz : ");
        vade = scanner.nextInt();

        double toplampara = anapara;
        double faizOrani = 0.06;

        for (int i = 1; i <= vade; i++) {
            toplampara = (toplampara * faizOrani) + toplampara;
            System.out.println(i + ".yilin sonunda toplam para : " + (int) toplampara);
        }
    }
}
