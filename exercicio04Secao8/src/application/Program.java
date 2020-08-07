package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Whats is the dollar price?");
		CurrencyConverter.price = sc.nextDouble();;
		
		System.out.println("How many dollars wil be  bought?");
		double dollar = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.converter(dollar));

	}

}
