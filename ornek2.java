import java.util.Scanner;

public class ornek2 {
    public static void main(String[] args) {
        
		Scanner scan = new Scanner(System.in);

		System.out.print("Bir sayı giriniz: ");
		int sayi = scan.nextInt();

		if (sayi % 2 == 0) {
			System.out.println("Sayı çiftir");
		} 
		else {
			System.out.println("Sayı tektir");
		}

    }
}
