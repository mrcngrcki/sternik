package pl.sternik.kk;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
//import org.junit.Rule;
import org.junit.Test;
//import org.junit.rules.ExpectedException;

public class Zad24Test {
	
	Zad24 sut;
	
//	@Rule
//	public ExpectedException exception = ExpectedException.none();
	
	@Before
	public void before() {
		sut = new Zad24();
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDzeleniaZero() throws Exception {
		
		sut.podziel(10,0);
	}
	
	@Test
	public void testElementowTablicy() {
		
		int actual = sut.dajElement(11);
		assertThat(actual).isEqualTo(0);
	}
	
	

}
