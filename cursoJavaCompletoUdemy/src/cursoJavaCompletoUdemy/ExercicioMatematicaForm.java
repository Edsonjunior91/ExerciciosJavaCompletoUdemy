package cursoJavaCompletoUdemy;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMatematicaForm {
	public final static  double PI = 3.14159;
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;
		
		System.out.println("Digite o valor do Lado A");
		a = sc.nextDouble();
		System.out.println("Digite o valor do Lado B");
		b = sc.nextDouble();
		System.out.println("Digite o valor do Lado C");
		c = sc.nextDouble();
		
		triangulo = a * c /2;
		circulo = c * c * PI;
		trapezio = ((a + b) * c)/2;
		quadrado = b * b;
		retangulo = a * b;
		
		System.out.printf("TRIANGULO: %.3f %n"
				+ "	CIRCULO: %.3f %n"
				+ " TRAPEZIO: %.3f %n"
				+ " QUADRADO: %.3f %n"
				+ " RETANGULO: %.3f %n", triangulo, circulo, trapezio, quadrado, retangulo);
		sc.close();
	}
	
}
