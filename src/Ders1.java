import java.util.Scanner;

public class Ders1 {
    public static void main(String[] args) {

        Scanner okuyucu = new Scanner(System.in);
        System.out.println("İsminiz nedir?");
        System.out.println("Soyisminiz nedir?");
        System.out.println("Yaşınız nedir?");
        System.out.println("Kullanıcı Adını giriniz!");
        System.out.println("Parolanızı giriniz!");
        String isim = okuyucu.next();
        String soyisim = okuyucu.next();
        String yas = okuyucu.next();
        String kullanıcı_ad = okuyucu.next();
        String parola1 = okuyucu.next();
        System.out.println("Merhaba, " + isim + " " + soyisim);
        System.out.println("Yaşınız, " + yas);
        System.out.println("Kullanıcı Adınız, " + kullanıcı_ad);
        System.out.println("Parolanızı Giriniz, " + parola1);


    }
}
