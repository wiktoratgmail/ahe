package ahe;

import java.io.*;
import java.util.*;

public class Goldbach {
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

	 

	public static void main(String[] args) {
		int liczba; // min i max powinnno byc podawane z konsoli //
		//int liczba2; // wynik odejmowania
		Scanner klawiatura = new Scanner(System.in);
		System.out.println("podaj liczbe:");
		liczba = klawiatura.nextInt();
		System.out.println("liczba to:" + liczba);
		for (int i = 0; i <= liczba / 2; i++) // pomijać
			if ((IsPrimary(i) == true) && (IsPrimary(liczba - i) == true)) {
				// liczba2 = liczba - i;
				System.out.println(liczba + " = " + (liczba - i) + " + " + i);
			}
	}
}	
	