package cursoJavaCompletoUdemy;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioLeituraSenha {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		int senha, digSenha;
		
		System.out.println("Crie uma nova senha");
		senha = sc.nextInt();
		
		System.out.println("Digite a senha");
		digSenha = sc.nextInt();
		
		while(senha != digSenha) {
			System.out.println("Senha Invalida - Digite a senha novamente");
			digSenha = sc.nextInt();
			
		}
		System.out.println("Senha Correta");

	}

}
