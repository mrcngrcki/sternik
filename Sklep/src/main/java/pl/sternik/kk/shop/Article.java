package main.java.pl.sternik.kk.shop;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	
	public void toTable(){
		Formatter f = new Formatter();
		f.format("%1$-14s %2$20s\n", "Name", name);
		f.format("%1$-14s %2$20s\n", "Description", description);
		f.format("%1$-14s %2$20.2f\n", "Price", price);
		f.format("%1$-14s %2$20d\n", "Id", id);
		System.out.println(f);
		f.close();
	}

	protected void printChange(){
		System.out.println("Zmieniono wartoœæ pola");
	}
	
	static boolean formatDaty(String description){
		Pattern p = Pattern.compile("\\d\\d-\\d\\d-\\d\\d\\d\\d");
		Matcher m = p.matcher(description);
		boolean wynik = false;
		
		while(m.find()){
			String mozeData = m.group();
			
			DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
			Date data = new Date();
			
			try{
				data = df.parse(mozeData);
				System.out.println("[Wykryto datê w opisie produktu: \"" + description + "\"]" + df.format(data) + " na pozycji " + m.start());
				wynik = true;
			}catch(ParseException e){
				System.out.println("B³¹d parsowania daty ze stringu: " + mozeData + e.getMessage());
			}
		}
		return wynik;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Article other = (Article) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Article artykul = new Article();
		Article.formatDaty("siemaneczko elo elo 12-12-2003 no co tam");
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
		
		artykul3.toTable();
	}

}


