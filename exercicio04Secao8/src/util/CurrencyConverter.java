package util;

public class CurrencyConverter {
	public static double price;
	
	
	public static double converter(double dollar ) {
		double imposto = dollar * 0.06 * price;
		return  dollar * price + imposto;
	}
}
