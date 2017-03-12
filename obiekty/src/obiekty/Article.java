package obiekty;

import obiekty.podpakiet.Book;
import obiekty2.Order;

public class Article {

	private int id;
	private String name;
	private String description;
	private double price;
	private static int counter;

	public Article(int id, String name, String description, double price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		counter++;
	}

	public Article() {
		super();
		this.id = 0;
		this.name = "Brak nazwy";
		this.description = "Opis";
		this.price = 0.0;
		counter++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		printChange();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		printChange();
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
		printChange();
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
		printChange();
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + "]";
	}

	protected void printChange(){
		System.out.println("Zmieniono wartoœæ pola");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Article artykul = new Article();

		artykul.setId(1);
		artykul.setName("Papier");
		artykul.setDescription("do drukowania");
		artykul.setPrice(14.99);

		System.out.println(artykul);
		System.out.println("Counter: " + artykul.counter);

		Article artykul2 = new Article(2, "Ksiazka", "Poradnik", 25.99);
		System.out.println(artykul2);
		System.out.println("Counter: " + artykul.counter);

		Article artykul3 = new Article(3, "Ziemniak", "batat", 0.99);
		System.out.println(artykul3);
		System.out.println("Counter: " + artykul.counter);
		
		Order zamowienie = new Order();
		
		//zad17
		Book ksiazka = new Book();
		System.out.println(ksiazka);
		
		Article bajka = new Book(1, "koziolek matolek","bajka", 9.99, "John Doe", 1980);
		System.out.println(bajka);
		//rzutowanie book na article
		Article koziolek = bajka;
		System.out.println(koziolek);
	}

}


