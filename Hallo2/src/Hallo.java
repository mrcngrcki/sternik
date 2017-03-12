
public class Hallo {

	int aa;
	public static void main(String[] args) {
		// syso ctr+spacja println
		// nazwa zmiennej alt+shift+r zmienia we wszystkich miejscach
		//ctrl+1 do podpowiedzi
		//przy zaznaczonej linii alt+shift+m do stworzenia metody
		//ctrl+o pokazuje budowê kodu
		//ctrl+w zamyka otwarty plik
		//ctrl+shift+p do otwierania klas
		
		double kokoko = 0.1;
		System.out.println(kokoko);
		String string = new String();
		
		String takie_tam = "blablabla";
		wyswietl(args, takie_tam);
		System.out.println("Hello!!" + args[1]);
	}

	private static void wyswietl(String[] args, String takie_tam) {
		System.out.println(takie_tam+"Hello!!" + args[0]);
	}

}
