package javadersleri.ders1;

import java.util.Scanner;

public class BedenKitleIndeks {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Kilonunuzu Giriniz...");
		int kilo = scanner.nextInt();

		System.out.println("Boyunuzu Giriniz....  (Örnek 1,80)");
		double boy = scanner.nextDouble();

		double bki = kilo / (boy * boy);
		System.out.println("Beden Kitle Ýndeksiniz : " + bki);

	}
}
