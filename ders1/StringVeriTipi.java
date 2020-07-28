package javadersleri.ders1;

public class StringVeriTipi {
	
	public static void main (String [] args) {
		
		String a = "Merhaba";
		 
		double b = 5.32;
		
		byte c = 10;
		
		 a = a+ b + c;
		
		System.out.println(a);
		
		char g ='?';
		
		String f = "Merhaba Nasýlsýn" + g;
		System.out.println(f);
		
		
		String z = "Java "
		+ "Programlama"
				+ " Dili";
		System.out.println(z);
		// ters \t 4 boþluk býrakýyor \n alt satýra geçiriyor
		String l = "Java\tProgramlama\nDili";
		
		System.out.println(l);
	}

}
