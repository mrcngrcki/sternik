package pl.sternik.kk;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class Zad02Test {

	@Test
	public void testMinimum() throws Exception {
		int[][] values = { { 3, 8, 16 }, { 1, 22, 28, 24 }, { 3 }, { 41, 42 } };
		int expected = 1;

		int actual = Zad02.findMin(values);
		assertThat(actual).isEqualTo(expected);
	}

	@Test
	public void testMaximum() throws Exception {
		int[][] values = { { 3, 8, 16 }, { 1, 22, 28, 24 }, { 3 }, { 41, 42 } };
		int expected = 42;

		int actual = Zad02.findMax(values);
		assertThat(actual).isEqualTo(expected);
	}

}
