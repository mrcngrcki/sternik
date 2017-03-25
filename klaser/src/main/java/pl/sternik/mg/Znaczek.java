package pl.sternik.mg;

import java.math.BigDecimal;
import java.util.Date;

public class Znaczek {
	
	private String Opis;
	private BigDecimal cena;
	private Date dataNabycia;
	private String krajPochodzenia;
	private long numerKatalogowy;
	
	public String getOpis() {
		return Opis;
	}
	public void setOpis(String opis) {
		Opis = opis;
	}
	public BigDecimal getCena() {
		return cena;
	}
	public void setCena(BigDecimal cena) {
		this.cena = cena;
	}
	public Date getDataNabycia() {
		return dataNabycia;
	}
	public void setDataNabycia(Date dataNabycia) {
		this.dataNabycia = dataNabycia;
	}
	public String getKrajPochodzenia() {
		return krajPochodzenia;
	}
	public void setKrajPochodzenia(String krajPochodzenia) {
		this.krajPochodzenia = krajPochodzenia;
	}
	public long getNumerKatalogowy() {
		return numerKatalogowy;
	}
	public void setNumerKatalogowy(long numerKatalogowy) {
		this.numerKatalogowy = numerKatalogowy;
	}
	@Override
	public String toString() {
		return "Znaczek [Opis=" + Opis + ", numerKatalogowy=" + numerKatalogowy + ", krajPochodzenia=" + krajPochodzenia
				+ ", cena=" + cena + ", dataNabycia=" + dataNabycia + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (numerKatalogowy ^ (numerKatalogowy >>> 32));
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
		Znaczek other = (Znaczek) obj;
		if (numerKatalogowy != other.numerKatalogowy)
			return false;
		return true;
	}
	

	
}
