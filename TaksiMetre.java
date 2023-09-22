package Giris;
import java.util.Scanner;
public class TaksiMetre {
    public static void main(String[] args) {
     Scanner inp= new Scanner(System.in);
     double acilis,kmTutar,min,yol,ücret;
     kmTutar=2.20;
     min=20;
     acilis=10;
     System.out.println("Yol Uzunluğu giriniz : ");
     yol= inp.nextDouble();
     ücret=(yol*kmTutar)+acilis;
     ücret= ücret>20 ? ücret :min;
     System.out.println("Ücretiniz : "+ücret);

}
}