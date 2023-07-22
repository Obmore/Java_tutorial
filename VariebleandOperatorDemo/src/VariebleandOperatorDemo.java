
public class VariebleandOperatorDemo {
	
	public static void main(String[] args) {
		// Primitív típusú változók:
		// Egész számok:
		byte a; 	// 8  bit -128...127
		short b;	// 16 bit -32768...32767
		int c; 		// 32 bit (sok) ezt használjuk
		long d; 	// 64 bit ha nagyot kell tárolni
		// Lebegő pontos számok:
		float e;
		double f;   // dupla pontos
		// Logikai érték:
		boolean g;	//True vagy False
		// Karakter:
		char h;
		
		// Referencia típusú változók
		
		// Operátorok:
		// +, -, *, / szokásos, műveleti sorrandet tudja
		// %: maradékos osztás, maradékot adja vissza
		// logikai || vagy, && és
		// ==, != egyenlőség, egyenlőtlenség
		// >>, << bitshift
		// ++, -- egyváltozós növelés, csökkentés
		int number = 20;
		boolean M = number + 10 < 100;
		System.out.println(M);
		// out: True
		
		int i = 100;
		i++;
		System.out.println(i);
		// out: 101 , ha ++i akkor is
	}

}
