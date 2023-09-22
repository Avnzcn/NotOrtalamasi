package Giris;
 import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args) {
double armut,elma,domates,muz,patlican,total;
Scanner inp=new Scanner(System.in);
/*
//FiyatListesi
Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
*/
        System.out.println("Armut Kilogram Giriniz : ");
        armut=inp.nextDouble();
        System.out.println("Elma Kilogram Giriniz : ");
        elma=inp.nextDouble();
        System.out.println("Domates Kilogram Giriniz : ");
        domates=inp.nextDouble();
        System.out.println("Muz Kilogram Giriniz : ");
        muz=inp.nextDouble();
        System.out.println("Patlıcan Kilogram Giriniz : ");
        patlican=inp.nextDouble();
        total=((armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlican*5.00));
        System.out.println("Toplam Tutar : "+total);
    }
}
