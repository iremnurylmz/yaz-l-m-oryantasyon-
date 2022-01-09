import java.util.Scanner;

public class ornek1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Bir sayı girini: ");
		int sayi = scan.nextInt();

		if (sayi < 0) {
			System.out.println("Sayı negatiftir");
		} 
		
		else if (sayi > 0) {
			System.out.println("Sayı pozitiftir");
		}

		else {
			System.out.println("Sıfır ne pozitif ne de negatif sayıdır. Başka sayı giriniz.");
		}

	}

}
