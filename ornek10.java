import java.util.Scanner;

public class ornek10 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

		int pc = (int) (Math.random() * 3) + 1; 

		System.out.println("1. Taş \n2. Kağıt \n3. Makas");

		System.out.print("Birini seçiniz: ");
		int kisi = scan.nextInt();

		System.out.println("pc: " + pc);

		if (kisi != 1 && kisi != 2 && kisi != 3) {
			System.out.println("Yanlış seçim yaptınız");
		}

		else {
			if (pc == kisi) {
				System.out.println("Berabere ");
			}
			if (pc == 1 && kisi == 2) {
				System.out.println("Kazandınız :)"); // pc:tas kisi:kagıt
			}
			if (pc == 1 && kisi == 3) {
				System.out.println("Kaybettiniz :(");
			}
			if (pc == 2 && kisi == 1) {
				System.out.println("Kaybettiniz  :(");
			}
			if (pc == 2 && kisi == 3) {
				System.out.println("Kazandınız :)");
			}
			if (pc == 3 && kisi == 1) {
				System.out.println("Kazandınız :)");
			}
			if (pc == 3 && kisi == 2) {
				System.out.println("Kaybettiniz  :(");
			}
		}
    }
}
