package pl.sternik.kk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Zad32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] tab = {"Ala","ma","kota","oraz","psa"};
		Zad32 z32 = new Zad32();
		
		String[] tab2 = z32.kopiujTab(tab);
		
		z32.pokazTabPetlaFor(tab2);
		
		Arrays.sort(tab2);
		
		z32.pokazTabPetlaForEach(tab2);
		
		List list = new ArrayList();
		list.add("Ala");
		list.add("ma");
		list.add("kota");
		list.add("oraz");
		list.add("psa");

		Collections.sort(list);
		
		z32.pokazListeIteratorem(list);
		pokazListeFor(list);
		pokazListeForEach(list);
	}

	public static void pokazListeForEach(List list) {
		System.out.println("---Lista For each---");
		for (Object object : list) {
			System.out.println(object);
		}
	}

	public static void pokazListeFor(List list) {
		System.out.println("---Lista For---");
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}
	}

	public String pokazListeIteratorem(List list) {
		System.out.println("---Lista iterator---");
		
		String wynik = "";
		String elem = "";
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			elem = it.next();
			System.out.println(elem);
			wynik = wynik + elem;
		}
		return wynik;
	}

	public String pokazTabPetlaForEach(String[] tab) {
		String wynik = "";
		System.out.println("---Tablica foreach---");
		for (String string : tab) {
			System.out.println(string);
			wynik = wynik + string;
		}
		return wynik;
	}

	public String pokazTabPetlaFor(String[] tab) {
		String wynik = "";
		System.out.println("---Tablica for---");
		for(int i = 0; i < tab.length; i++){
			System.out.println(tab[i]);
			wynik = wynik + tab[i].toString();
		}
		return wynik;
	}
	
	public String[] kopiujTab(String[] tablica){
		String[] tabKopia = new String[tablica.length];
		System.arraycopy(tablica, 0, tabKopia, 0, tablica.length);
		return tabKopia;
	}

}
