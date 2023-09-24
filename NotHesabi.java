package Giris;
import java.util.Scanner;
public class NotHesabi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int mat, kim, tur, fiz, muzik;
        int n = 5;
        System.out.println("Matematik Notunuzu Giriniz :");
        mat = inp.nextInt();
        if (mat < 0) {
            mat = 0;
            n = n - 1;
        }
        if (mat > 100){
            mat = 0;
        n = n - 1;

    }
       System.out.println("Türkçe Notunuzu Giriniz :");
       tur=inp.nextInt();
        if (tur<0) {
            tur=0; n=n-1;
        }if(tur>100){
            tur=0; n=n-1;
        }
       System.out.println("Fizik Notunuzu Giriniz :");
       fiz= inp.nextInt();
        if (fiz<0) {
            fiz=0; n=n-1;
        }if(fiz>100){
            fiz=0; n=n-1;
        }
       System.out.println("Kimya Notunuz Giriniz :");
       kim=inp.nextInt();
        if (kim<0) {
            kim=0; n=n-1;
        }if(kim>100){
            kim=0; n=n-1;
        }
       System.out.println("Müzik Notunuz Giriniz :");
       muzik=inp.nextInt();
        if (muzik<0) {
            muzik=0; n=n-1;
        }if(muzik>100) {
            muzik = 0;
            n = n - 1;
        }
       double avr;
       avr=((mat+kim+tur+fiz+muzik)/n);
       if (avr>55){
           System.out.println("Sınıfı Geçtiniz Tebrikler !");


       }else {
          System.out.println("Sınıfta Kaldınız !");
       }

System.out.println("Not Ortalamanız : "+avr);
    }
}


