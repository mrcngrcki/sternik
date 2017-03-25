package pl.sternik.mg;

public class ProstaBazaDanych {

	private Znaczek[] baza;

	public ProstaBazaDanych(int rozmiarBazy) {
		baza = new Znaczek[rozmiarBazy];
	}

	// test w domu
	public void addZnaczek(Znaczek znaczek) {
		for (int i = 0; i < baza.length; i++) {
			if (baza[i] == null) {
				baza[i] = znaczek;
				znaczek.setNumerKatalogowy(i);
				return;
			}
		}
	}

	public boolean deleteZnaczek(int numerKatalogowy) {
		if (!sprawdzPoprawnoscNumeruKatalogowego(numerKatalogowy)) {
			return false;
		}
		baza[numerKatalogowy] = null;
		return true;
	}

	public boolean updateZnaczek(Znaczek znaczek) {
		int numerKatalogowy = (int) znaczek.getNumerKatalogowy();
		if (!sprawdzPoprawnoscNumeruKatalogowego(numerKatalogowy)) {
			return false;
		}

		Znaczek z = baza[(int) znaczek.getNumerKatalogowy()];
		if (z == null) {
			System.out.println("Nie ma znaczka o tym numerze, nic nie robie");
			return false;
		} else {
			System.out.println("Jest taki znaczek, zamieniam");
		}
		baza[(int) znaczek.getNumerKatalogowy()] = znaczek;
		return true;
	}

	public Znaczek getZnaczek(int numerKatalogowy) throws NoSuchZnaczekException{
		if (!sprawdzPoprawnoscNumeruKatalogowego(numerKatalogowy)) {
			throw new NoSuchZnaczekException();
		}
		return baza[numerKatalogowy];
	}
	
	private boolean sprawdzPoprawnoscNumeruKatalogowego(int numerKatalogowy) {
		if (numerKatalogowy < 0 || numerKatalogowy >= baza.length) {
			System.out.println("Z³y numer katalogowy");
			return false;
		}
		return true;
	}

	public void wyswietlBaze() {
		for (int i = 0; i < baza.length; i++) {
			System.out.println("" + i + ":" + baza[i]);
		}
	}

}
