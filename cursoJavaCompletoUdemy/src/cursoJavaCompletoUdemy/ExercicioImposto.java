package cursoJavaCompletoUdemy;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioImposto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario, imposto;
		
		System.out.println("Digite o valor do sal�rio");
		salario = sc.nextDouble();
		
		if(salario > 0.00 && salario <=2000.00) {
			imposto = 0.00;
		}else if(salario >2000.00 && salario <=3000.00) {
			imposto = (salario - 2000)*0.08;
		}else if(salario > 3000.00 && salario <= 4500.00) {
			imposto = (salario - 3000.00)*0.18 + 1000.00 * 0.08;
		}else{
			imposto = (salario - 4500.00)*0.28 + 1500.00 * 0.18 + 1000.00 * 0.08;
		}
		
		if(imposto == 0.0) {
			System.out.println("Isento");
		}else {
			System.out.printf("R$%.2f", imposto);
		}

	}

}
