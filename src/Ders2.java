import java.util.Scanner;

public class Ders2 {
    public static void main(String[] args) {

        Scanner para = new Scanner(System.in);

        int bakiye = 5000;
        System.out.println("Bakiyeniz = " + bakiye);
        System.out.println("\n****YAPACAĞINIZ İŞLEMİ SEÇİNİZ****\n");
        System.out.println("1.İŞLEM -> Para Çekme");
        System.out.println("2.İŞLEM -> Para Yatırma");
        System.out.println("3.İŞLEM -> Hesap Hareketleri");
        System.out.println("4.İŞLEM -> Kart İşlemleri");

        System.out.print("\nİsleminizi Seciniz: ");
        int islem = para.nextInt();

        switch (islem) {
            case 1:
                System.out.println("Bakiyeniz =" + bakiye);
                System.out.println("Çekeceğiniz tutarı giriniz: ");
                int tutar = para.nextInt();
                if (tutar > bakiye) {
                    System.out.println("Yetersiz bakiye. Tekrar giriniz: ");
                    tutar = para.nextInt();
                }
                bakiye -= tutar;
                System.out.println("Yeni bakiyeniz = " + bakiye);
                break;

            case 2:
                System.out.println("Bakiyeniz = " + bakiye);
                System.out.print("Yatırmak istediğiniz tutarı giriniz: ");
                tutar = para.nextInt();
                bakiye += tutar;
                System.out.println("Yeni bakiyeniz = " + bakiye);
                break;

            case 3:
                System.out.println("Bakiyeniz = " + bakiye);
                break;

            case 4:
                System.out.println("Lütfen Kartınızı Almayı UNUTMAYINIZ!!!");
            default:
                System.out.println("İşleminizi yanlış seçtiniz. Lütfen Tekrarlayınız.");



        }





    }
}
