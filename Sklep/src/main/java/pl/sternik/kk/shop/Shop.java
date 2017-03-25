package main.java.pl.sternik.kk.shop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Shop {

	// kolekcje
	private final List<Employee> pracownicy = new ArrayList<Employee>();
	private final Map<Article, Integer> slownikProduktow = new HashMap<Article, Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mostPopular = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

		Shop sklep = new Shop();
		Order zamowienie = new Order();
		zamowienie.accept();

		// kolekcje
		Article mleko = new Article(17, "mleko", "UHT", 2.99);
		sklep.addArticle(mleko, 10);
		sklep.addArticle(new Article(12, "chleb", "razowy", 3.99), 4);
		System.out.println(sklep.slownikProduktow);

		Employee prac1 = new Employee(12, "Janusz Maj");
		sklep.pracownicy.add(prac1);
		sklep.pracownicy.add(new Employee(13, "Marcin"));
		System.out.println(sklep.pokazListe(sklep.pracownicy));

		// Wejœcie-wyjœcie
		sklep.zapiszListePracownikow("pracownicy.txt");
		System.out.println("Po:");
		sklep.wczytajListePracownikow("pracownicy.txt");
		System.out.println(sklep.pokazListe(sklep.pracownicy));
	}

	private void zapiszListePracownikow(String nazwaPliku) {
		File file = new File(nazwaPliku);
		if (!file.exists()) {
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
				for (Employee e : getSortedEmployees()) {
					bw.write(e.getId() + " " + e.getName());
					bw.newLine();
				}
				bw.flush();
			} catch (IOException e) {
				System.out.println("B³¹d zapis pliku " + nazwaPliku);
			}
		}
	}

	private void wczytajListePracownikow(String nazwaPliku) {
		int id = 0;
		String name = "";

		File file = new File(nazwaPliku);
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line = br.readLine();
			while (line != null) {
				Scanner s = new Scanner(line);
				id = s.nextInt();
				name = s.next();
				addEmployee(new Employee(id, name));
				s.close();
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("B³¹d odczytu z pliku " + nazwaPliku);
			System.exit(-1);
		}
	}

	public String pokazListe(List<Employee> lista) {
		String wynik = "";
		for (Employee employee : lista) {
			System.out.println(employee);
			wynik = wynik + employee;
		}
		return wynik;
	}

	public boolean hasEmployee(Employee prac) {
		return pracownicy.contains(prac);
	}

	public boolean hasArticle(Article artykul) {
		return slownikProduktow.containsKey(artykul);
	}

	public void addEmployee(Employee prac) {
		if (!hasEmployee(prac)) {
			pracownicy.add(prac);
		}
	}

	public int getArticleQuantity(Article artykul) {
		int ile = 0;
		if (slownikProduktow.containsKey(artykul)) {
			ile = slownikProduktow.get(artykul);
		}
		return ile;
	}

	public void addArticle(Article artykul, int quantity) {
		int ile = 0;
		// albo nowy artykul albo tylko dodatkowa ilosc istniejacego
		// najpierw sprawdzamy czy jest juz taki na liscie
		boolean jestArt = hasArticle(artykul);
		// jesli jest to pobierz jego licznosc
		if (jestArt) {
			ile = getArticleQuantity(artykul);
		}
		slownikProduktow.put(artykul, ile + quantity);
	}

	public List<Employee> getSortedEmployees() {
		List<Employee> posortowana = new ArrayList<>();
		posortowana.addAll(0, pracownicy);
		// for (Employee employee : posortowana) {
		// posortowana.add(employee);
		// }
		Collections.sort(posortowana);
		return posortowana;
	}

	public List<Employee> getSortedEmployeesByID() {
		List<Employee> posortowana = new ArrayList<>();
		posortowana.addAll(0, pracownicy);
		Collections.sort(posortowana, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getId() == o2.getId() ? 0 : o1.getId() - o2.getId();
			}
		});
		return posortowana;
	}
}
