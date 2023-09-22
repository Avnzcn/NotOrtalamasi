package Giris;
import java.util.Scanner;
public class NotOrtalamasıHesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int Mat , Fizik , Kimya ,Turkce ,Tarih ,Muzik;

        System.out.println("Matematik Notunuz :\t");
        Mat=inp.nextInt();

        System.out.println("Fizik Notunuz :\t");
        Fizik=inp.nextInt();

        System.out.println("Kimya Notunuz :\t");
        Kimya=inp.nextInt();

        System.out.println("Türkçe Notunuz :\t");
        Turkce=inp.nextInt();

        System.out.println("Tarih Notunuz :\t");
        Tarih=inp.nextInt();

        System.out.println("Müzik Notunuz :\t");
        Muzik=inp.nextInt();

        double ort;
        ort=((Mat+Fizik+Kimya+Tarih+Turkce+Muzik)/6);
        System.out.println("Ortalamanız :\t"+ort);
    boolean snc=  ort>=60;
   String str1 = snc ? "Geçtiniz" : "Kaldınız";
   System.out.println(str1);





    }
}
