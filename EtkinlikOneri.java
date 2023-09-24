package Giris;
import java.util.Scanner;
public class EtkinlikOneri {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int heat;
      System.out.println("Sıcaklık Giriniz : ");
      heat=inp.nextInt();
      if (heat<5){
System.out.println("Kayak Yapabilirsiniz.");
        }
      else {
      if (heat >= 5 && heat<=15){
              System.out.println("Sinemeya Gidebilirsin.");


              if (heat>=10 && heat<=25) {
                  System.out.println("Piknik Yapabilirisn.");

              }
          }else {
          System.out.println("Yüzme Yapabilirisin.");
      }

      }


    }
}