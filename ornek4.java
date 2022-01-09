import java.util.Scanner;

public class ornek4 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
		double kilo, boy, bki;

		System.out.print("Kilonuzu giriniz: ");
		kilo = scan.nextDouble();

		System.out.print("Boyunuzu giriniz: ");
		boy = scan.nextDouble();

		bki = kilo / (boy * boy);

		System.out.println("Beden kitle indeksiniz: " + bki);

		if (bki < 18.5) {
			System.out.println("Zayıf");
		} 
		else if (bki > 18.5 && bki < 24.9) {
			System.out.println("Normal kilo");
		} 
		else if (bki > 25 && bki < 29.9) {
			System.out.println("Fazla kilo");
		} 
		else if (bki > 30 && bki < 34.9) {
			System.out.println("1. Derecede obez");
		} 
		else if (bki > 35 && bki < 39.9) {
			System.out.println("2. Dereceden obez");
		} 
		else {
			System.out.println("3. Dereceden obez");
		}
    }
}
