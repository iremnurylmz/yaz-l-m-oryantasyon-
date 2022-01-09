import java.util.Scanner;

public class ornek9 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
		String ad = "irem";
		String parola = "123";
		int girishakki = 3;

		System.out.println("Giriş paneli sistemine hoşgeldiniz \n");

		while (true) {
			System.out.print("Kullanıcı adınızı giriniz: ");
			String isim = scan.nextLine();

			System.out.print("Parolanızı giriniz: ");
			String sifre = scan.nextLine();

			if (isim.equals(ad) && sifre.equals(parola)) {
				System.out.println("Sisteme hoşgeldin " + ad);
				girishakki -= 1;
				break;
			}

			else if (!isim.equals(ad) && sifre.equals(parola)) {
				System.out.println("Kullanıcı adınız yanlış \n");
				girishakki -= 1;
			}

			else if (isim.equals(ad) && !sifre.equals(parola)) {
				System.out.println("Parolanız yanlış \n");
				girishakki -= 1;
			}

			else {
				System.out.println("Kullanıcı adınız ve parolanız yanlış \n");
				girishakki -= 1;
			}

			if (girishakki == 0) {
				System.out.println("Giriş hakkınız doldu");
				break;
			}

		}
    }
}
