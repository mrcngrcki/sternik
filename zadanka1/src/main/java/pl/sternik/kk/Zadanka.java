package pl.sternik.kk;

public class Zadanka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] tab = { "Ala", "ma", "kota" };

		int count = 0;
		
		String tmp1 = zrobPetleFor(tab);
		System.out.println(tmp1);

		String tmp2 = zrobPetleForEach(tab);
		System.out.println(tmp2);

		String tmp3 = zrobPetleWhile(tab);
		System.out.println(tmp3);

	}

	static String zrobPetleFor(String[] tab) {
		StringBuilder sb = new StringBuilder();
		sb.append("Petla FOR");
		for (int i = 0; i < tab.length; i++) {
			sb.append("\n");
			sb.append(tab[i]);
		}
		return sb.toString();
	}

	static String zrobPetleForEach(String[] tab) {
		StringBuilder sb = new StringBuilder();
		sb.append("Petla FOR EACH");
		for (String i : tab) {
			sb.append("\n");
			sb.append(i);
		}
		return sb.toString();
	}

	static String zrobPetleWhile(String[] tab) {
		int count = 0;
		StringBuilder sb = new StringBuilder();
		sb.append("Petla WHILE");
		while (count < tab.length) {
			sb.append("\n");
			sb.append(tab[count]);
			count++;
		}
		return sb.toString();
	}
}
