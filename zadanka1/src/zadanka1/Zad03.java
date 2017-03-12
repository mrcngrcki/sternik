package zadanka1;

import java.util.Scanner;

public class Zad03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] tablica = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Scanner in = new Scanner(System.in);
		int j;

		System.out.println("Podaj liczbê:");
		int x = in.nextInt();
		x = (int) x;

		j = 0;
		for (int i : tablica) {
			if (i % x == 0) {
				System.out
						.println("FOR: Liczba " + i + " jest podzielna przez " + x + " i znajduje siê na pozycji " + j);
				break;
			}
			j++;
		}

		int i = -1;
		boolean podzielna = false;
		do {
			i++;
			podzielna = tablica[i] % x == 0;
		} while (!podzielna);
		if (podzielna) {
			System.out.println(
					"WHILE: Liczba " + tablica[i] + " jest podzielna przez " + x + " i znajduje siê na pozycji " + i);
		}
	}

}
