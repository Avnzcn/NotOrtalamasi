package Giris;
import java.util.Scanner;
public class DaireDilimiAlan {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        double r,alan,aci,pi ;
        pi=3.14;
        //Formül : (𝜋 * (r*r) * 𝛼) / 360
        System.out.println("Dairenin Yarıçapı : ");
        r=inp.nextDouble();
        System.out.println("Daire Diliminin Açısı : ");
        aci=inp.nextDouble();
        alan=((pi*Math.pow(r,2)*aci)/360);
        System.out.println("Daire Diliminin Alanı : "+alan);


    }
}
