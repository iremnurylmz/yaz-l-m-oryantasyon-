import java.util.Random;
import java.util.Scanner;

public class ornek7 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
		Random rnd = new Random();
		
		System.out.println("0-100 arasında bir sayı giriniz: ");
		int tahmin=scan.nextInt();
		
		int sayi= rnd.nextInt(101);
		
		while (sayi!= tahmin) {
			if(tahmin < 0 || tahmin > 100) {
				System.out.println("0-100 arasında bir sayı girinz: ");
				tahmin = scan.nextInt();
			}
			else if (tahmin < sayi) {
				System.out.println(" Daha büyük sayı giriniz: ");
				tahmin = scan.nextInt();				
			}
			else if (tahmin > sayi) {
				System.out.println("Daha küçük sayı giriniz: ");
				tahmin= scan.nextInt();
			}
			
		}
			System.out.println("Tebrikler, kazandınız!");
    }
}
