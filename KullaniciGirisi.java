package Giris;
import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        String userName,password;
        System.out.println("Kullanıcı Adınız : ");
        userName=inp.nextLine();
        System.out.println("Şifreniz : ");
        password=inp.nextLine();
         if(userName.equals("patika") && password.equals("java123")){
             System.out.println("Giriş Yaptınız !");
         }else {
             int a;
             System.out.println("Bilgileriniz Yanlış !");
             if (userName.equals("patika"))
                 System.out.println("1-Şifre Sıfırla\n" + "2- Sonlandır");
             a = inp.nextInt();
             if (a==1){
                 Scanner inp1=new Scanner(System.in);
                 String yeniSifre;
             System.out.println("Yeni Parola Giriniz : ");
             yeniSifre=inp1.nextLine();
             if (yeniSifre.equals("java123")) {
                 System.out.println("Şifre Oluşturulamadı ! ");
             }else {
                 System.out.println("Şifreniz Değiştirildi !");
             }
             }if (a==2){
             System.out.println("Sonlandırıldı");}
             if (a!=1 && a!=2){
                 System.out.println("Hatalı Giriş !");
             }



         }

         }



         }



