package Giris;
import java.util.Scanner;
public class VucutKitleEndeksi {
    public static void main(String[] args) {
      Scanner inp=new Scanner(System.in);
      double kilo,boy,snc;
      System.out.println("Lütfen Boyunuzu Giriniz(m) : ");
      boy= inp.nextDouble();
      System.out.println("Lütfen Kilonuzu Giriniz(kg) : ");
      kilo=inp.nextDouble();
      //Formül : Kilo (kg) / Boy(m) * Boy(m)
        snc=kilo/(boy*boy);
        System.out.println("Vücut Kitle Endeksiniz : "+snc);

    }
}
