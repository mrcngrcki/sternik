package zadanka1;

import java.util.Scanner;

public class Zad04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tablica = pobierztablice(args);
		int[][] out = new int[tablica.length][];
		for (int i = 0; i <= tablica.length - 1; i++) {
			out[i] = new int[tablica[i]];
			for (int j = 0; j <= tablica[i] - 1; j++) {
				out[i][j] = j;
			}
		}
		wyswietl(out);
	}

	private static int[] pobierztablice(String[] args) {
		int[] tablica;
		String[] tmp;
		if(args.length == 0){
			Scanner input = new Scanner(System.in);
			System.out.print("Podaj wymiary: ");
			String wymiary = input.nextLine();
			tmp = wymiary.split(" ");
		}else{
			tmp = args;
		}
		tablica = new int[tmp.length];
		for (int i = 0; i < tmp.length; i++) {
			tablica[i] = Integer.valueOf(tmp[i]);
		}
		
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
