import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculateKiloTest {

	CalculateKilo convertToKilo = new CalculateKilo();
	double yards = convertToKilo.convertToYards(2.0);

	double calucaltedMiles = 1.2345;
	double calucaltedYards = 2187.87;


	@Test
	public void testSum() {
		System.out.println("@Kilometers to miles (): " + yards + " = " + calucaltedYards);
		extracted();
	}

	@SuppressWarnings("deprecation")
	private void extracted() {
		assertEquals(yards, calucaltedYards);
	}

}

