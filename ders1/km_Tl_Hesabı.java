package javadersleri.ders1;

import java.util.Scanner;

public class km_Tl_Hesabý {
	//kilometrede ne kadar tl yaktýðýný gösteren uygulama 
	public static void main (String [] args ) {
		
	
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Aracýnýz kilometrede kaç kuruþ yakýyor (Örnek 0,54) ");
	double kurus = scanner.nextDouble();
	System.out.println("Aracýnýzla kaç kilometre yol gittiniz");
	int km = scanner.nextInt();
	System.out.println("Toplamda ödemeniz gereken tutar " + (kurus*km) + " tl dir ");
	
	


}
	
}
