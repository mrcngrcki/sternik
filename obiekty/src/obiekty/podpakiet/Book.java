package obiekty.podpakiet;

import obiekty.Article;

public class Book extends Article{
	private String autor;
	private int rok;
	//zad18
	public Book(int id, String name, String description, double price, String autor, int rok) {
		super(id, name, description, price);
		this.autor = autor;
		this.rok = rok;
	}
	public Book(){}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
		printChange();
	}
	public int getRok() {
		return rok;
	}
	public void setRok(int rok) {
		this.rok = rok;
		printChange();
	}

	public String toStringOld() {
		return "Book [autor=" + autor + ", rok=" + rok + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getDescription()=" + getDescription() + ", getPrice()=" + getPrice() + "]";
	}
	@Override
	public String toString() {
		return "Book [autor=" + autor + ", rok=" + rok + ", " + super.toString() + "]";
	}
	
}