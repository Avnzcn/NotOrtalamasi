package Donguler;
import java.util.Scanner;
public class BolumOrt {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        int x,y ;
       double t=0;
        int z=0;
        int count=0;
        System.out.println("Sayı Giriniz : ");
        x= inp.nextInt();
        for (y=0;y<=x;y++){
      if (y%3==0 && y%4==0){
            z+=y;
            count++;
          System.out.println(y);

      }

        }
        t=z/count;
        System.out.println(t);

    }
}
