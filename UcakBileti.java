package Giris;
import java.util.Scanner;
public class UcakBileti {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int yas, secenek;
        double km, mesafe, indirimlitutar, yasindirimi1, yasindirimi2, yasindirimi3, mesadeindirim;
        double x,y,z;
        yasindirimi1 = 0.5;
        yasindirimi2 = 0.1;
        yasindirimi3 = 0.3;
        mesadeindirim = 0.20;
        mesafe=0.10;
        System.out.println("Lütfen Mesafe Giriniz(km) :");
        km = inp.nextDouble();
        System.out.println("Lütfen Yaşınızı Giriniz :");
        yas = inp.nextInt();
        System.out.println("Gidiş Bileti İçin ->1\n" + "Gidiş-Dönüş Bileti İçin ->2");
        secenek = inp.nextInt();
        if (km <= 0) {
            System.out.println("Hatalı Giriş !");
        } else if (yas <= 0) {
            System.out.println("Hatalı Giriş !");

        } else if (secenek <= 0 || secenek > 2) {
            System.out.println("Hatalı Giriş !");

        }if (yas>=0 && yas<=12){
            if (secenek==1){
                x=((km*mesafe));
                System.out.println("Normal Tutar : "+x);
                y=yasindirimi1*x;
                z=x-y;
                System.out.println("İndirim Tutarı : "+y);
                System.out.println("Ödenecek Tutar : "+z);


            }if(secenek==2){
                x=((km*mesafe));
                System.out.println("Normal Tutar : "+x);
                y=(mesadeindirim+yasindirimi1)*x;
                z=x-y;
                System.out.println("İndirim Tutarı : "+y);
                System.out.println("Ödenecek Tutar : "+z);

            }
        }if (yas>=12 && yas<=24){
            if (secenek==1){
                x=((km*mesafe));
                System.out.println("Normal Tutar : "+x);
                y=yasindirimi2*x;
                z=x-y;
                System.out.println("İndirim Tutarı : "+y);
                System.out.println("Ödenecek Tutar : "+z);


            }if(secenek==2){
                x=((km*mesafe));
                System.out.println("Normal Tutar : "+x);
                y=(mesadeindirim+yasindirimi2)*x;
                z=x-y;
                System.out.println("İndirim Tutarı : "+y);
                System.out.println("Ödenecek Tutar : "+z);

            }
        }if (yas>65){
            if (secenek==1){
                x=((km*mesafe));
                System.out.println("Normal Tutar : "+x);
                y=yasindirimi3*x;
                z=x-y;
                System.out.println("İndirim Tutarı : "+y);
                System.out.println("Ödenecek Tutar : "+z);


            }if(secenek==2){
                x=((km*mesafe));
                System.out.println("Normal Tutar : "+x);
                y=(mesadeindirim+yasindirimi3)*x;
                z=x-y;
                System.out.println("İndirim Tutarı : "+y);
                System.out.println("Ödenecek Tutar : "+z);

            }
        }
    }
}



