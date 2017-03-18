package pl.sternik.kk;

import java.util.Scanner;

public class Zad05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] tablica = {{0,0},{0,1},{0,2}};
		wyswietl(tablica);
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Podaj 1 wiersz do zmiany:");
		int w1 = input.nextInt();
		System.out.println("Podaj 2 wiersz do zmiany:");
		int w2 = input.nextInt();
		zamien(w1, w2, tablica);
		wyswietl(tablica);
	}
	private static int[][] zamien(int w1, int w2, int[][] tablica){

		int[] temp1 = tablica[w1];
		int[] temp2 = tablica[w2];
		tablica[w2] = temp1;
		tablica[w1] = temp2;
		return tablica;
		}
	private static void wyswietl(int[][] tablica) {

		for (int i = 0; i <= tablica.length - 1; i++) {
			for (int j = 0; j <= tablica[i].length - 1; j++) {
				System.out.print("[" + i + " , " + tablica[i][j] + "] ");
			}
			System.out.print("\n");
		}
	}
}
