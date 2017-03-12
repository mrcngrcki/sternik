package zadanka1;

public class Zadanka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] tab = new String[3];
		String ala = "Ala";
		String ma = "ma";
		String kota = "kota";
		tab[0] = ala;
		tab[1] = ma;
		tab[2] = kota;
		int count = 0;
		
		for(int i = 0; i < tab.length; i++){
			System.out.println(tab[i]);
		}
		
		for(String i : tab){
			System.out.println(i);
		}
		while(count < tab.length){
			System.out.println(tab[count]);
			count++;
		}
	}

}
