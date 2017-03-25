package main.java.pl.sternik.kk.shop;

public class Address {

	private String adres;

	Address(String adres) {
		adres = "";
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	@Override
	public String toString() {
		return this.adres.toString();
	}

}
