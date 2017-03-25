package pl.sternik.mg;

import java.math.BigDecimal;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		ProstaBazaDanych baza = new ProstaBazaDanych(3);
		
		Znaczek z = new Znaczek();
		z.setNumerKatalogowy(1);
		z.setCena(new BigDecimal("1.99"));
		z.setDataNabycia(new Date());
		z.setKrajPochodzenia("Polska");
		z.setOpis("Jan Pawe³ 2");
	
	baza.addZnaczek(z);
	baza.wyswietlBaze();
	baza.deleteZnaczek(1);
	baza.wyswietlBaze();
	
	z.setNumerKatalogowy(1);
	z.setOpis("JP2");
	baza.updateZnaczek(z);
	baza.wyswietlBaze();
	
	Znaczek znaczek;
	try {
		znaczek = baza.getZnaczek(11);
	} catch (NoSuchZnaczekException e) {
		System.out.println("No z³y numer!");
	}

	}

}
