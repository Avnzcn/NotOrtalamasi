package Giris;
import java.util.Scanner;
public class BurcBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int month, day;
        System.out.println("Doğduğunuz Ay :");
        month = inp.nextInt();
        System.out.println("Doğduğunuz Gün :");
        day = inp.nextInt();
        if (month == 1) {
            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    System.out.println("Burcunuz Oğlak.");
                }
                if (day > 21) {
                    System.out.println("Burcunuz Kova.");
                }

            }


        }
        if (month == 2) {
            if (day >= 1 && day <= 31) {
                if (day <= 19) {
                    System.out.println("Burcunuz Kova.");
                }
                if (day > 19) {
                    System.out.println("Burcunuz Balık.");
                }

            }
        }
        if (month == 3) {
            if (day >= 1 && day <= 31) {
                if (day <= 20) {
                    System.out.println("Burcunuz Balık.");
                }
                if (day > 20) {
                    System.out.println("Burcunuz Koç.");
                }

            }
        }
        if (month == 4)
        {
            if (day >= 1 && day <= 31) {
                if (day <= 20) {
                    System.out.println("Burcunuz Koç.");
                }
                if (day > 20) {
                    System.out.println("Burcunuz Boğa.");
                }

            }


        }
        if(month==5){
            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    System.out.println("Burcunuz Boğa.");
                }
                if (day > 21) {
                    System.out.println("Burcunuz İkizler.");
                }

            }

        }
        if(month==6){
            if (day >= 1 && day <= 31) {
                if (day <= 22) {
                    System.out.println("Burcunuz İkizler.");
                }
                if (day > 22) {
                    System.out.println("Burcunuz Yengeç.");
                }

            }
        }
        if (month==7) {
            if (day >= 1 && day <= 31) {
                if (day <= 22) {
                    System.out.println("Burcunuz Yengeç.");
                }
                if (day > 22) {
                    System.out.println("Burcunuz Aslan.");
                }

            }
        }
        if (month==8){
            if (day >= 1 && day <= 31) {
                if (day <= 22) {
                    System.out.println("Burcunuz Aslan.");
                }
                if (day > 22) {
                    System.out.println("Burcunuz Başak.");
                }

            }
        }
        if(month==9){
            if (day >= 1 && day <= 31) {
                if (day <= 22) {
                    System.out.println("Burcunuz Başak.");
                }
                if (day > 22) {
                    System.out.println("Burcunuz Terazi.");
                }

            }
        }
        if (month==10){
            if (day >= 1 && day <= 31) {
                if (day <= 22) {
                    System.out.println("Burcunuz Terazi.");
                }
                if (day > 22) {
                    System.out.println("Burcunuz Akrep.");
                }

            }
        }
        if (month==11){
            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    System.out.println("Burcunuz Akrep.");
                }
                if (day > 21) {
                    System.out.println("Burcunuz Yay.");
                }

            }
        }
        if (month==12){
            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    System.out.println("Burcunuz Yay.");
                }
                if (day > 21) {
                    System.out.println("Burcunuz Oğlak.");
                }

            }

        }
    }
}

