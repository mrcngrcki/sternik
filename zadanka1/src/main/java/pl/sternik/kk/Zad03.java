package pl.sternik.kk;

public class Zad03 {

	MyScanner in;
	
	public Zad03(MyScanner in) {
		super();
		this.in = in;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] tablica = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		MyScanner in = new MyScanner(System.in);
		Zad03 zad03 = new Zad03(in);

		zad03.findWithScanner(tablica, in);

		in.close();

	}

	int findWithScanner(int[] tablica, MyScanner in) {
		System.out.println("Podaj liczbê:");
		int x = in.nextInt();
		x = (int) x;
		
		int tmp = znajdzPodzielna(tablica, x);
		
		if(tmp > -1){
		System.out.println(
				"FOR: Liczba " + tablica[tmp] + " jest podzielna przez " + x + " i znajduje siê na pozycji " + tmp);
		}
		else{
			System.out.println("Brak liczby podzielnej");
		}
		return tmp;
	}

	public int znajdzPodzielna(int[] tablica, int dzielnik) {
		for (int i = 0; i < tablica.length; i++) {
			if (tablica[i] % dzielnik == 0) {
				return i;
			}
		}
		return -1;
	}

}
