package teste;

public class Calculadora {

	public static Float soma(Float i, Float j) {
		if(i == null  || j == null)
			throw new NullPointerException("Os dois valores devem estar preenchidos");
		return i + j;
	}

}
