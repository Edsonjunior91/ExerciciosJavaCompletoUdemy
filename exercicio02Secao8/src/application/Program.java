package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		
		System.out.println("Digite o nome do funcionário");
		employee.name = sc.nextLine();
		
		System.out.println("Salário Bruto");
		employee.grossSalary = sc.nextDouble();
		
		System.out.println("Digite a taxa em reais");
		employee.tax = sc.nextDouble();
		
		System.out.println("Employee: "+ employee);
		
		System.out.print("Which percentage to increase salary?");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println("Updated data: "+ employee);

	}

}
