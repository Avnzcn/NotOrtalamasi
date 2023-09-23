package Giris;
import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        double n1,n2;

        int secim;
System.out.println("1.Sayı Girini : ");
n1=inp.nextDouble();
System.out.println("2.Sayıyı Griniz : ");
n2=inp.nextDouble();
        System.out.println("Lütfen İşlem Seçiniz : \n"+"1- Toplama\n"+"2- Çıkarma\n"+"3- Çarpma\n"+"4- Bölme");
        secim= inp.nextInt();

        switch (secim){
            case 1:
                System.out.println("Sonuç : "+(n1+n2));
                break;
            case 2:
                System.out.println("Sonuç : "+(n1-n2));
                break;
            case 3:
            System.out.println("Sonuç : "+(n1*n2));
                break;
            case 4:
                if(n2==0){
                    System.out.println("Belirsiz");
                }else {
                    System.out.println("Sonuç : " + (n1 / n2));
                }
                break;
            default:
                System.out.println("Hatalı İşlem !");

        }



    }
}
