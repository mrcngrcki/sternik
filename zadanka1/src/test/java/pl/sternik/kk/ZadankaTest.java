package pl.sternik.kk;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class ZadankaTest {

	@Test
	public void testDummy() throws Exception {
		assertThat(1).isEqualTo(1);
	}

	@Test
	public void testPetliFor() throws Exception {
		String[] tab = { "Ala", "ma", "kota" };
		String expected = "Petla FOR\nAla\nma\nkota";

		String actual = Zadanka.zrobPetleFor(tab);

		assertThat(actual).isEqualTo(expected);
	}

	@Test
	public void testPetliForEach() throws Exception {
		String[] tab = { "Ala", "ma", "kota" };
		String expected = "Petla FOR\nAla\nma\nkota";

		String actual = Zadanka.zrobPetleFor(tab);

		assertThat(actual).isEqualTo(expected);
	}

	@Test
	public void testPetliWhile() throws Exception {
		String[] tab = { "Ala", "ma", "kota" };
		String expected = "Petla FOR\nAla\nma\nkota";

		String actual = Zadanka.zrobPetleFor(tab);

		assertThat(actual).isEqualTo(expected);
	}

}
