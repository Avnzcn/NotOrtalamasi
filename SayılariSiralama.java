package Giris;
import java.util.Scanner;
public class SayılariSiralama {
    public static void main(String[] args) {
    Scanner inp=new Scanner(System.in);
    double a,b,c;
        System.out.println("1.Sayıyı Giriniz :");
        a= inp.nextDouble();
        System.out.println("2.Sayıyı Giriniz :");
        b= inp.nextDouble();
        System.out.println("3.Sayıyı Giriniz :");
        c= inp.nextDouble();

    if (a<b && a<c){
        if (b<c){
            System.out.println("1.Sayı<2.Sayı<3.Sayı");
        }else{
            System.out.println("1.Sayı<3.Sayı<2.Sayı");
        }
    } else if (b<a && b<c ){
        if(a<c){
            System.out.println("2.Sayı<1.Sayı<3.Sayı");

        }else {
            System.out.println("2.Sayı<3.Sayı<1.Sayı");
        }


    } else if (c<a &&c<b) {
        if(a<b){
            System.out.println("3.Sayı<1.Sayı<2.Sayı");


        }else {
            System.out.println("3.Sayı<2.Sayı<1.Sayı");
        }

    }
    System.out.println("Program Bitti");
  }

}


