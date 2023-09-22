package Giris;

import java.util.Scanner;

public class UcgenAlan {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        double a, b, c;
        System.out.println("1.Kenar Uzunluğunu Giriniz(cm) :\t");
        a = inp.nextDouble();
        System.out.println("2.Kenar Uzunluğunu Giriniz(cm) :\t");
        b = inp.nextDouble();
        System.out.println("3.Kenar Uzunluğunu Giriniz(cm) :\t");
        c=inp.nextDouble();
        /*
        * formül
        * Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
        * 𝑢 = (a+b+c) / 2
        * Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
        */
        double u,cevre,alan;
        cevre=a+b+c;
        u=cevre/2;
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Alan :\t"+alan+"cm");

    }
}
