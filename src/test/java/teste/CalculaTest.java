package teste;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CalculaTest {

	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void test() {
		Float soma = Calculadora.soma(2f, 5f);
		assertEquals(7f, soma, 0.5);
	}

	@Test
	public void notEqualsTest() {
		Float soma = Calculadora.soma(2f, 5f);
		assertNotEquals(3f, soma, 1);
	}

	@Test
	public void notTwoNullsTest() {
		thrown.expect(NullPointerException.class);
		thrown.expectMessage("Os dois valores devem estar preenchidos");

		Calculadora.soma(null, null);
	}
	
	@Test (expected = NullPointerException.class)
	public void notFirstNullTest() {
		Calculadora.soma(null, 5f);
	}

	@Test
	public void notSecondNullTest() {
		thrown.expect(NullPointerException.class);
		thrown.expectMessage("Os dois valores devem estar preenchidos");

		Calculadora.soma(5f, null);
	}
	
}