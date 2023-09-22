package Giris;
import java.util.Scanner;
public class KdvHesaplama {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        double tutar,kdvOran ;
        System.out.println("Tutar Giriniz :\t");
        tutar = inp.nextDouble();
        kdvOran = tutar>=1000 ?  0.08 : 0.18;
        double KdvTutar=tutar+(tutar*kdvOran);
    double Eklenen=tutar*kdvOran;
        System.out.println("KDV'siz Tutar : "+ tutar);
        System.out.println("KDV Tutarı : "+Eklenen);
        System.out.println("KDV Oranı : "+kdvOran);
        System.out.println("KDV'li Tutar : "+KdvTutar);


}
}
