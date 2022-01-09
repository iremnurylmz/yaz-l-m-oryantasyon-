import java.util.Scanner;

public class ornek6 {
    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);
        int sayi1,sayi2,secim;

        System.out.print("Birini sayıyı giriniz: ");
        sayi1= scan.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        sayi2= scan.nextInt();

        System.out.println("Yapmak istediğiniz işlemi seçiniz: ");
        System.out.println("\n 1.Toplam \n 2.Çıkarma \n 3.Çarpma \n 4.Bölme");

        System.out.println("Seçiminiz: ");
        secim=scan.nextInt();

        switch(secim){
            case 1:
            System.out.println("Toplama işleminin sonucu: " + (sayi1+sayi2));
            break;

            case 2:
            System.out.println("Çıkarma işleminin sonucu: " + (sayi1-sayi2));
            break;

            case 3:
            System.out.println("Toplama işleminin sonucu: " + (sayi1*sayi2));
            break;

            case 4:
            System.out.println("Toplama işleminin sonucu: " + (sayi1/sayi2));
            break;

            default: 
            System.out.println("Yanlış seçim yaptınız.Seçiminizi kontrol ediniz.");
            break;

        }
    }
}
