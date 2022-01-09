import java.util.Scanner;

public class ornek3 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
		int toplam = 0;

		System.out.print("Üst aralık giriniz: ");
		int sayi = scan.nextInt();

		for (int i = 1; i <= sayi; i++) {

			if (i % 2 != 0) {
				toplam += i;
			}
		}

		System.out.println("Tek sayıların toplamı " + toplam);
    }
}
