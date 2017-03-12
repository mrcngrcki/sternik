package zadanka1;

public class Zad06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] liczby = { { 1, 1, 1, 2, 4 }, { 2, 1, 2, 2, 2 } };
		char[] znaki = { '+', 'x', '-', '*', '/' };
		int[] out = new int[znaki.length];
		
		for(int i = 0; i < liczby.length; i++){
			for(int j = 0; j < liczby[i].length; j++){
				System.out.print(liczby[i][j]);
			}
			System.out.print("\n");
		}
		for(int i = 0; i < znaki.length; i++){
			System.out.print(znaki[i]);
		}
		System.out.print("\n");
		
		for (int j = 0; j < znaki.length; j++) {
			switch (znaki[j]) {
			case '-': {
				out[j] = liczby[0][j] - liczby[1][j];
				break;
			}
			case '*': {
				out[j] = liczby[0][j] * liczby[1][j];
				break;
			}
			case '/': {
				out[j] = liczby[0][j] / liczby[1][j];
				break;
			}
			default:{
				out[j] = liczby[0][j] + liczby[1][j];
			}
			}
		
			System.out.print(out[j]);
		}
		
		}
	}


