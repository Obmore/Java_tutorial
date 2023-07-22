import java.lang.reflect.Array;
import java.util.Arrays;

public class Blocks {

	public static void main(String[] args) {
		
//		// tömb létrehozása
//		int [] numbers = new int [10];
//		
//		// int [] numbers;
//		// numbers = new int [10];
//		
//		// tömb feltöltése
//		numbers [0] = 4;
//		numbers [1] = 12;
//		numbers [2] = 7;
//		numbers [3] = -6;
//		numbers [4] = 53;
//		numbers [5] = 42;
//		numbers [6] = 31;
//		numbers [7] = 0;
//		numbers [8] = -100;
//		numbers [9] = 72;
//		
//		// tömb elemeinek lekérdezése
//		System.out.println(numbers[5]);
//		// out: 42
//		// System.out.println(numbers[6]); out: 31 ...
//		System.out.println(Arrays.toString(numbers));
//		// out: [4, 12, 7, -6, 53, 42, 31, 0, -100, 72]
		
		// Több dimenziós
		// tömb létrehozása
		int [][] numbers = new int [4][6]; // sor, oszlop
		
		// tömb feltöltése
		numbers[1][2] = 42;
		
		// tömb elemeinek lekérdezése
		System.out.println(numbers[1][2]);
		// out: 42
		
		String [] names = {"János", "Lázár", "Kocsis", "Maugli"};
		
		System.out.println(Arrays.toString(names));
		// out: [János, Lázár, Kocsis, Maugli]
		
		
	}

}
