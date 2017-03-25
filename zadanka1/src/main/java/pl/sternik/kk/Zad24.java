package pl.sternik.kk;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class Zad24 {
	
	
	
	public static void main(String[] args) {

		int a, b;
		a = 10;
		b = 0;
		int[] tablica = {1,2,3,4,5};

		Zad24 z24 = new Zad24();
		
		try{
		System.out.println(z24.podziel(a, b));
		}catch(ArithmeticException e){
			System.out.println("Nie dziel przez 0!");
		}
		z24.dajElement(6);
	//	z24.wczytaj();
	}

	double podziel(int a, int b) {
		double w = 0;
		w = a / b;
		return w;

	}
	
	int dajElement(int i){
		int[] tablica = {1,2,3,4,5};
		try{
			System.out.print(tablica[i]);
			return tablica[i];
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Nie ma takiego elementu w tablicy!");
			return 0;
		}
	}
	
	public static Date wczytaj(){
		Scanner input = new Scanner(System.in);
		System.out.println("Podaj datê w formacie dd.mm.yyyy:");
		String tekst = input.nextLine();
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
		Date d;
		try{
			d = df.parse(tekst);
			return d;
		}catch(ParseException e){
			System.out.println("B³êdny format daty");
			e.printStackTrace();
			return null;
		}finally{
			input.close();
		}
	}

}
