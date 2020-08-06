package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc  = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Digite o nome do Aluno");
		student.name = sc.nextLine();
		
		System.out.println("Digite a primeira nota");
		student.note1 = sc.nextDouble();
		System.out.println("Digite a segunda nota");
		student.note2 = sc.nextDouble();
		System.out.println("Digite a terceira nota");
		student.note3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f %n", student.finalGrade());
		
		if(student.finalGrade() < 60) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS ", student.missingPoints());
		}else {
			System.out.print("PASS");
		}
		

	}

}
