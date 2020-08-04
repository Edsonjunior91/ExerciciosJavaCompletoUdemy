package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Enter rectangle width and height:");
		retangulo.width = sc.nextDouble();
		retangulo.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f ", retangulo.area());
		System.out.printf("%nPERIMETER = %.2f",retangulo.perimeter());
		System.out.printf("%nDIAGONAL = %.2f" ,retangulo.diagonal());
		
		sc.close();
	}

}
