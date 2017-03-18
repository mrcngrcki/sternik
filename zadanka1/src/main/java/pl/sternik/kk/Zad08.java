package pl.sternik.kk;

public class Zad08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte miesiac;
		int rok;
		int temp;
		
		miesiac = 3;
		rok = 1995;
		temp = 32;
		
		int month;
		long year;
		long temperature;
		
		month = miesiac;
		year = rok;
		temperature = temp;
		
		Integer m = new Integer(month);
		Long r = new Long(year);
		Long t = new Long(temperature);
		
		if(m == month)
		{
			System.out.println("m == month");
		}
		if(r != year)
		{
			System.out.println("r != year");
		}
		if(t.equals(temperature)){
			System.out.println("t.equals(temperature)");
		}
	}

}
