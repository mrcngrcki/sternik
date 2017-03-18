package pl.sternik.kk;

public class Zad07 {

	public enum Stan{
		NOWE, OCZEKUJACE, REALIZOWANE, WYSLANE, ZWROT
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Zad07 zamowienie = new Zad07();
			for(Stan s : Stan.values()){
				System.out.println("----- Wywo³anie dla: " + s.name());
				System.out.println(zamowienie.zwrocOpisStanu(s));
			}
	}

	public String zwrocOpisStanu(Stan stan){
		String opis ="";
		
		switch (stan) {
		case REALIZOWANE:
			opis = "Pilne!";
			break;
		case ZWROT:
			opis = "Kontakt!";
			break;

		default:
			opis=stan.toString();
			break;
		}
		return opis;
	};
}
