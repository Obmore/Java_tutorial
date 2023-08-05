import java.util.Scanner;
// CTRL + SHIFT + O

/**
 * Írjunk Java programot, ami bekér a felhaszáltól egy pozitív egész számot,
 * majd kiszámolja, hogy ez az összeg milyen címletekkel adható ki úgy, 
 * hogy a legkevesebb címletet használjuk fel!
 */

public class CurrencyCalculater {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Kérem, adja meg a pénzösszeget: ");
		int moneyAmount = scanner.nextInt();
		scanner.nextLine();
		
		if (moneyAmount < 0 == true) {
			System.out.println("ERROR: A megadott pénzösszeg nem lehet negatív.");
			System.out.println("Próbáld újra!");
			
			System.out.print("Kérem, adja meg a pénzösszeget: ");
			moneyAmount = scanner.nextInt();
			scanner.nextLine();
		}
		
		if (moneyAmount % 5 != 0) {
			System.out.println("ERROR: A megadott pénzösszeg 0-ra vagy 5-re végződhet.");
			System.out.println("Próbáld újra!");
			
			System.out.print("Kérem, adja meg a pénzösszeget: ");
			moneyAmount = scanner.nextInt();
			scanner.nextLine();
		}
		System.out.println("A megadott pénzösszeg: " + moneyAmount);
		
		/* Címletek
		 * 20 000
		 * 10 000
		 *  5 000
		 *  2 000
		 *  1 000
		 *    500
		 *    200
		 *    100
		 *     50
		 *     20
		 *     10
		 *      5
		 */
		
		int[] currencies = {20_000, 10_000, 5_000, 2_000, 1_000, 500, 200, 100, 50, 20, 10, 5};
		int[] pieces = new int[currencies.length];
		int remainingAmount = moneyAmount;
		
		for (int i = 0; i<currencies.length; i++) {
			pieces[i] = remainingAmount / currencies[i];
			remainingAmount = remainingAmount % currencies[i];
		}
		
		// System.out.println(Arrays.toString(currencies));
		// System.out.println(Arrays.toString(pieces));
		
		for (int i = 0; i<pieces.length; i++) {
			System.out.println(pieces[i] + " db " + currencies[i] + "Ft-ost tartalmaz");
		}
	}
}
