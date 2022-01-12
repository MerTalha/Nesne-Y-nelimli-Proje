import java.util.Scanner;

public class otelrezervasyon extends oteldata{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Otel rezervasyonuna hosgeldiniz. \nOtelimizde VIP ve Normal olmak uzere iki cesit odalarimiz vardir.");
        System.out.println("2 kisilik Normal bir oda istiyorsaniz 1 veya 2 numarali odalardan birini secerek gun ayarlayabilirsiniz.");
        System.out.println("4 kisilik Normal bir oda istiyorsaniz 3 veya 4 numarali odalardan birini secerek gun ayarlayabilirsiniz.");
        System.out.println("2 kisilik VIP bir oda istiyorsaniz 5 numarali odayi secerek gun ayarlayabilirsiniz.");
        System.out.println("4 kisilik VIP bir oda istiyorsaniz 6 numarali odayi secerek gun ayarlayabilirsiniz.");
        int odaNo = 1;
        
            do {
                try {
                System.out.println("----------------------------------------------------------");
                System.out.println("Rezervasyon iptal yapmak istiyorsaniz iptal-Rezervasyon yapmak istiyorsaniz rezervasyon yaziniz.");
                String rezervasyon = scanner.next();
                if (rezervasyon.equalsIgnoreCase("rezervasyon")) {
                    System.out.println("Rezervasyon yapmak istediginiz oda no'sunu giriniz: ");
                    odaNo = scanner.nextInt();
                    System.out.println("Rezervasyon yapmak istediginiz bir gunu giriniz: ");
                    String gun = scanner.next();
                    reservation(gun, odaNo);
                } else if (rezervasyon.equalsIgnoreCase("iptal")) {
                    System.out.println("Rezervasyonu iptal etmek istediginiz odanin no'sunu giriniz: ");
                    int odaNoIptal = scanner.nextInt();
                    System.out.println("Iptal etmek istediginiz gunu giriniz: ");
                    String iptalGun = scanner.next();
                    rezervasyonIptal(iptalGun, odaNoIptal);
                }
                System.out.println("Toplam fiyat: " + getToplamFiyat());
                System.out.println("------------------------------------------------");
                System.out.println("Baska oda rezerve etmek istiyorsaniz 1, programi bitirmek istiyorsaniz 0 giriniz.");
                odaNo = scanner.nextInt();
                }catch (Exception e) {
                    System.out.println(e.getMessage());
                    System.out.println("Sayi bir deger giriniz.");
                }
            } while (odaNo != 0);


        System.out.println("-----------------------------------------------------");
        System.out.println("Program sona ermistir.");
        System.out.println("Toplam odenecek tutar: " + getToplamFiyat());

    }
}