package ahe;

import java.util.Scanner;
public class Goldbach {
	private static Scanner klawiatura;
	// funkcja sprawdzajaca czy liczba pierwsza
	static boolean IsPrimary(int a) {
		if (a > 2) {
			double sq = Math.sqrt(a);
			if (a % 2 == 0)
				return false;
			else {
				for (int i = 3; i <= sq; i += 2) {
					if (a % i == 0) {
						return false;
					}
				}
				return true;
			}
		} else if (a == 2)
			return true;
		return false;
	}
	
	// funkcja zwracajaca pare liczb blizniaczych 
	static void showTwins(int l) {
		for (int i = 0; i <= l / 2; i++) // pomijać
			if ((IsPrimary(i) == true) && (IsPrimary(l - i) == true)) {
				System.out.print(l + " = " + (l - i) + " + " + i + "; ");
			}
	}
	
	// 
	public static void main(String[] args) {
		int min; // poczatek zakresu 
		int max; // koniec zakresu
		
		// interfejs uzytkownika
		klawiatura = new Scanner(System.in);
		System.out.println("podaj min:");
		min = klawiatura.nextInt();
		System.out.println("min to:" + min);
		System.out.println("podaj max:");
		max = klawiatura.nextInt();
		System.out.println("max to:" + max);

		// petla podaje liczby blizniacze dla liczb parzystych z zakresu uzytkownika
		for (int j = min; j <= max; j++)
			// odpalamy z kolejnymi liczbami z zakresu jesli sa parzyste
			if (j % 2 == 0) {
				// System.out.println(j);
				showTwins(j);
				System.out.println(" ");
			}
	}
}