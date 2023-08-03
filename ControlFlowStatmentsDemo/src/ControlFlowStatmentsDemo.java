
public class ControlFlowStatmentsDemo {

	public static void main(String[] args) {
		// IF ... ELSE:
		
//		System.out.print("Ma ");
//		int dayOfMonth = 3;
//		if(dayOfMonth == 2) {
//			System.out.print("hétfő");
//			
//		}
//		if(dayOfMonth == 3) {
//			System.out.print("kedd");
//			
//		}
//		System.out.print(" van.");
		
//		int dayOfWeek = 6;
//		if(dayOfWeek >= 6) {
//			System.out.println("Hétvége van");
//		}else {
//			System.out.println("Hétköznap van");
//		}
		
//		int Number = 52;
//		
//		if(Number < 0) {
//			System.out.println("A szám negatív");
//		}else if(Number > 0) {
//			System.out.println("A szám pozitív");
//		}else {
//			System.out.println("A szám 0");
//		}
		
//		SWITCH UTASÍTÁS:
//		int dayOfWeek = 3;
//		
// 		switch(dayOfWeek) {
// 		case 1: 
// 			System.out.println("Hétfő");
// 			break;	
// 		case 2: 
// 			System.out.println("Kedd");
// 		break;
// 		// Innentől végig fut break segít!
// 		case 3: 
// 			System.out.println("Szerda");
// 			break;
// 		case 4: 
// 			System.out.println("Csütörtök");
// 			break;	
// 		case 5: 
// 			System.out.println("Péntek");
// 			break;
// 		case 6: 
// 			System.out.println("Szombat");
// 			break;
// 		case 7: 
// 			System.out.println("Vasárnap");
// 			break;
// 		}
 		//Használjuk a force true logic-ot
//		switch(dayOfWeek) {
//		case 1:
//		case 2:
//		case 3:
//		case 4:
//		case 5:
//			System.out.println("Hétköznap");
//			break;
//		case 6:
//		case 7:
//			System.out.println("Hétvége");
//			break;
//		default:
//			System.out.println("Nem jó");
//			break;
//		}
		
//		SWITCH KIFEJEZÉS (Új)
//		
//		int dayOfWeek = 1;
//		String nameOfDay = switch (dayOfWeek) {
//		case 1 -> {
//			// ...
//			yield "Hétfő";
//		}
//		case 2 -> "Kedd";
//		case 3 -> "Szerda";
//		case 4 -> "Csütörtök";
//		case 5 -> "Péntek";
//		case 6 -> "Szombat";
//		case 7 -> "Vasárnap";
//		default -> "Ismeretlen";
//		};
		
//		SIMA FOR CIKLUS:
//		System.out.println(nameOfDay);
//		System.out.println("Helló!");
//		for(int i = 0; i < 5 ; i++) {
//			System.out.print("Az i változó értéke: ");
//			System.out.println(i);
//		}
//		System.out.println("Viszlát");
		
//		FOR EACH CIKLUS:
//		System.out.println("Helló!");
//		String[] names = {"Teszt Elek", "John Doe", "Jane Doe"};
//		for (String name : names) {
//			System.out.println("Név: " + name);
//		}
//		System.out.println("Viszlát");
//		
//// 		WHILE CIKLUS		
//		int i = 435_435;
//		while (i>0) {
//			i /= 10;
//			System.out.println(i);
//		}
//		
//// 		DO WHILE CIKLUS		
//		int j = 30;
//		do {
//			System.out.println(j);
//			j /= 2;
//		} while (j > 0);
//		
//		System.out.println("Alma");
////		CÍMKÉZETLEN CONTIUNE		
//		for(int k = 0; k < 20 ; k++) {
//			if (k % 2 == 0) {
//				continue; //ugrás a következő iterációra
//			}
//			System.out.println(k);
//		} 
////		CÍMKÉZETT CONTIUNE
//		String[] dayOfWeek = {"Hétfő", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap"};
//		String[] mealsOfDay = {"Reggeli", "Tízórai", "Ebéd", "Uzsonna", "Vacsora"};
//		outer: for (String day : dayOfWeek) {
//			System.out.println(day + ": ");
//			inner: for (String meal : mealsOfDay) {
//				if (day.equals("Kedd")) {
//					continue outer;
//				}
//				System.out.print(meal + " ");
//			}
//			System.out.println("\n");
//		}
//		CÍMKÉZETLEN BREAK
//		int[] numbers = {65, 23, 12, 77, 99, 56, -56, 141};
//		for (int i = 0; i < numbers.length; i++) {
//			if (numbers[i] == 99) {
//				System.out.println("99 szerepel a számok között");
//				break;
//			}
//		}

//		CÍMKÉZETT BREAK
		String[] dayOfWeek = {"Hétfő", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap"};
		String[] mealsOfDay = {"Reggeli", "Tízórai", "Ebéd", "Uzsonna", "Vacsora"};
		outer: for (String day : dayOfWeek) {
			System.out.println(day + ": ");
			inner: for (String meal : mealsOfDay) {
				if (day.equals("Csütörtök")) {
					break outer;
				}
				System.out.print(meal + " ");
			}
			System.out.println("\n");	
		}
	}
}


