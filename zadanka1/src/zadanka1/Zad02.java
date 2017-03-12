package zadanka1;

public class Zad02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[][] values = {{3,8,16},
							{1,22,28,24},
							{3},
							{41,42}
			};
			int min;
			int max;
			
			min = values[0][0];
			max = values[0][0];
			
			//szukanie max i min
			for(int[] is : values){
				for(int i : is){
					if(i >= max){
						max = i;
					}
					if(i <= min){
						min = i;
					}
				}
			}
			System.out.println("Max = " + max);
			System.out.println("Min = " + min);
	}

}
