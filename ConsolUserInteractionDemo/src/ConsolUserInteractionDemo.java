import java.util.Scanner;
/**
 * Ez az osztály bemutatja a scanner használatát
 * 
 */
public class ConsolUserInteractionDemo {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		//Típus név = ...
//		System.out.print("Kérem adjon meg egy egész számot: ");
//		int number = scanner.nextInt();
//		scanner.nextLine();
//		System.out.println("A szám: " + number);
//		
//		System.out.print("Kérem adjon meg egy lebegőpontos számot: ");
//		double myDoubleNumber = scanner.nextDouble();
//		scanner.nextLine();
//		System.out.println("A szám: " + myDoubleNumber);
//		
//		System.out.print("Kérem adjon meg egy szöveget: ");
//		String MyString = scanner.nextLine();
//		System.out.println("A megadott szöveg: " + MyString);
	
		Scanner scanner = new Scanner(System.in);
		System.out.print("Kérem adja meg az első számot: ");
		int FirstNumber = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Kérem adja meg a második számot: ");
		int SecondNumber = scanner.nextInt();
		scanner.nextLine(); 
		// Sorvége karakter eltávolítása a standard bemenetről
		
		//int Sum = FirstNumber + SecondNumber;
		System.out.print("A kettő összege: " + (FirstNumber + SecondNumber) + "\n");
		System.out.print("A kettő szorzata: " + (FirstNumber * SecondNumber));
		
		scanner.close();
		/*
		 * 
		 * 
		 * WOW
		 * Szuper
		 */
	
	}
}
