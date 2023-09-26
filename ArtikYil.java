package Giris;
import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {

       Scanner inp=new Scanner(System.in);
       int yıl,kalan;
       System.out.println("Yıl Giriniz : ");
       yıl= inp.nextInt();

       kalan=yıl%4;
       if (kalan==0 && yıl%100!=0 || yıl%400==0){
           System.out.println(yıl+" Bir Artık Yıldır.");
       }else {
           System.out.println(yıl+" Artık Yıl Değildir.");
       }
    }
}
