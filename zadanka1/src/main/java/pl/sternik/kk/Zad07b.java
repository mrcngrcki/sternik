package pl.sternik.kk;

enum StanLepszy{
	NOWE(), OCZEKUJACE(), REALIZOWANE("Pilne"), WYSLANE(), ZWROT("Kontakt!");
	private String stan = "";
	//konstruktor ze stringami
	private StanLepszy(String stan){
		this.stan = stan;
	}
	//konstruktor pusty
	private StanLepszy(){}
	public String getStan(){
		if("".equals(stan))
			return this.toString();
		else
			return stan;
	}
};

public class Zad07b {
	public static void main(String[] args) {
		for(StanLepszy s : StanLepszy.values()){
			System.out.println("----- Wywo³anie dla: " + s.name());
			System.out.println(s.getStan());
		}
	}

}
