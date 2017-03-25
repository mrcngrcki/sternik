package pl.sternik.kk;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Scanner;
import static org.mockito.Mockito.*;
import org.junit.Before;
import org.junit.Test;

public class Zad03Test {

	int[] tablica = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	MyScanner in ;
	Zad03 sut;
	
	
	@Before
	public void before(){
		in = mock(MyScanner.class);
		
		sut = new Zad03(in);
	}
	
	@Test
	public void testPodzielnosci() throws Exception {
		int dzielnik = 3;
		
		int actual = sut.znajdzPodzielna(tablica, dzielnik);
		assertThat(actual).isEqualTo(2);
		
	}

	@Test(expected = ArithmeticException.class)
	public void testDzielPrzezZero() throws Exception {
		int dzielnik = 0;
		
		sut.znajdzPodzielna(tablica, dzielnik);
		tablica[6] = 1;
	}
	
	@Test
	public void testWithMockito(){
		when(in.nextInt()).thenReturn(5);
		
		int actual = sut.findWithScanner(tablica, in);
		
		assertThat(actual).isEqualTo(4);
		verify(in).nextInt();
	}
	
}
