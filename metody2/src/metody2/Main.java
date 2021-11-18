 package metody2;

public class Main {

	public static void main(String[] args) {

//	dzielniki(0);
		int tablica[] = { 1, 25, 2, 3, 5, 10, 15, 14, 21 };
		// String[] tablicaslow = { "Ala", "Kasia", "Olekssiebolek" };
		wypiszTablice(wiekszeOd(tablica, 20));

		
		
		// Podzielne7(tablica);

		// System.out.println(dlugoscStringow(tablicaslow));

	}

	// Wypisz dzielniki liczby naturalnej podanej jako parametr
	// np dla 16 wynik to 1,2,4,8,16

//	public static void dzielniki(int a) {
//		if (a == 0) {
//			System.out.println("Ta liczba nie ma dzielników");
//		}
//		for (int i = 1; i <= a; i++) {
//			if (a % i == 0) {
//				System.out.println(i);
//			}
//		}
//	}
//}

// Napisz metode ktora za swoj parametr przyjmuje tablice intow a nastepnie
// zwraca sume wszystkich liczb ktore sa umieszczone w tej tablicy.

//	public static void sumaTablicy(int tab[]) {
//		int suma = 0;
//
//		for (int i = 0; i < tab.length; i++) {
//			suma += tab[i];
//
//		}
//		System.out.println(suma);
//	}
//}

// Napisz metode ktora za swoj parametr przyjmuje tablice intów, a nastepnie
// zwraca tablice liczb liczb wiêkszych od 5

//	public static void WiekszeOd5(int tab[]) {
//
//		for (int i = 0; i < tab.length; i++) {
//			if (tab[i] < 5) {
//				System.out.print("");
//			} else {
//				System.out.println(tab[i]);
//			}
//
//		}
//	}
//}

	public static int[] wiekszeOd(int tab[], int wiekszeOd) {
		int ileWiekszychOd = 0;

		for (int i = 0; i < tab.length; i++) {
			if (tab[i] > wiekszeOd) {
				ileWiekszychOd++;
				//System.out.println(ileWiekszychOd);
			}
						
		}
		int[] tablicaWiekszych = new int [ileWiekszychOd];
		int indeksWiekszych=0;
		
		for (int j = 0; j < tab.length; j++) {
			if (tab[j] > wiekszeOd) {
				
				tablicaWiekszych[indeksWiekszych]=tab[j];
				//System.out.println(tablicaWiekszych[j]);
				indeksWiekszych++;
			}
		}
	
		//for (int k = 0 ; k<tablicaWiekszych.length ; k++) {
		//	System.out.println(tablicaWiekszych[k]);
		//}
		return tablicaWiekszych;
	}


	public static void wypiszTablice (int tab[]) {
		for (int i = 0 ; i <tab.length ; i ++) {
			System.out.println(tab[i]);
		}
		
		}
	}
	

// Napisz metode ktora za swoj parametr przyjmuje tablice intow, a nastepnie
// wypisuje wszystkie liczby podzielne przez 2 ktore sa wieksze niz 7

//	public static void Podzielne7(int tab[]) {
//		int pom = 0;
//		for (int i = 0; i < tab.length; i++) {
//			if (tab[i] > 7) {
//				pom = tab[i];
//				System.out.println(pom);
//			}
//
//		}
//	}
//}

// Napisz metode ktora za swoj parametr przyjmuje tablice stringow, a nastepnie
// zwraca sume dlugosci tych stringów

//	public static int dlugoscStringow(String tab[]) {
//		int dlugoscstringow = 0;
//		for (int i = 0; i < tab.length; i++) {
//			int a = tab[i].length();
//			dlugoscstringow += a;
//		}
//		return dlugoscstringow;
//	}
//}
