import java.util.Scanner;

public class ornek8 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
		int bakıye = 1000;

		System.out.println("1- Bakiye öğrenme: ");
		System.out.println("2- Para Çekme: ");
		System.out.println("3- Para Yatırma: ");
		System.out.println("4- Sistemden Çıkış: ");

		System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
        int islem= scan.nextInt();

		switch (islem) {
		case 1:
			System.out.println("Bakiyeniz: " + bakıye + " tl dir");
			break;

		case 2:
			System.out.print("Ne kadar çekmek istiyorsunuz?");
			int miktar = scan.nextInt();
			bakıye -= miktar;

			if (miktar > bakıye) {
				System.out.println("Yetersiz bakiye");
			}
			System.out.println("Yeni bakiyeniz: " + bakıye + " tl dir");
			
			

			break;

		case 3:
			System.out.print("Ne kadar yatırmak istiyorsunuz?");
			int yatırma = scan.nextInt();
			bakıye += yatırma;
			System.out.println("Yeni bakiyeniz: " + bakıye + " tl dir");
			break;

		case 4:
			System.out.println("Sistemen Çıkış Yaptınız");
			break;
			
			default: System.out.println("Yanlış seçim yaptınız tekrar deneyiz");

		}
    }
}
