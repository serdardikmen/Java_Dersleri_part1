package javadersleri.ders1;

import java.util.Scanner;

public class km_Tl_Hesab� {
	//kilometrede ne kadar tl yakt���n� g�steren uygulama 
	public static void main (String [] args ) {
		
	
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Arac�n�z kilometrede ka� kuru� yak�yor (�rnek 0,54) ");
	double kurus = scanner.nextDouble();
	System.out.println("Arac�n�zla ka� kilometre yol gittiniz");
	int km = scanner.nextInt();
	System.out.println("Toplamda �demeniz gereken tutar " + (kurus*km) + " tl dir ");
	
	


}
	
}
