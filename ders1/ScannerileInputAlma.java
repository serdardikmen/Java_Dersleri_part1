package javadersleri.ders1;

import java.util.Scanner;

public class ScannerileInputAlma {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		if (scanner.hasNextInt()) {
			int sayi = scanner.nextInt();
			System.out.println("Sayi : " + sayi);
		} else {
			System.out.println("Lütfen bir sayý giriniz..  ");

		}
	}
}