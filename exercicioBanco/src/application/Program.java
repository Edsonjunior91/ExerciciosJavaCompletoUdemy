package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta = new Conta();
		
		System.out.print("Digite o numero da Conta para cadastro: ");
		int numConta = sc.nextInt();
		conta.setNumConta(numConta);
		System.out.print("Digite o nome do titular da Conta: ");
		String nomTitConta = sc.next();
		conta.setNomTitConta(nomTitConta);
		System.out.print("Deseja depositar um valor inicial?");
		String depositar = sc.next();
		
		System.out.println(depositar);
		
		if(depositar == "sim") {
			System.out.println("Digite o valor que irá depositar");
			double valorConta = sc.nextDouble();
			conta.setValorConta(valorConta);
			
			System.out.println("Acount Data:");
			System.out.printf("Acount %d, Holder: %s, Balance: $ %.2f%n%n", conta.getNumConta(), conta.getNomTitConta(), conta.getValorConta());
		}else {
			System.out.println("Acount Data:");
			System.out.printf("Acount %d, Holder: %s, Balance: $ %.2f%n%n", conta.getNumConta(), conta.getNomTitConta(), conta.getValorConta());

		}
		
		

		System.out.print("Enter a deposit value: ");
		double deposito = sc.nextDouble();
		conta.deposito(deposito);
		System.out.println("Acount Data:");
		System.out.printf("Acount %d, Holder: %s, Balance: $ %.2f%n%n", conta.getNumConta(), conta.getNomTitConta(), conta.getValorConta());
		
		System.out.print("Enter a withdraw value: ");
		double saque = sc.nextDouble();
		conta.saque(saque);
		System.out.println("Acount Data:");
		System.out.printf("Acount %d, Holder: %s, Balance: $ %.2f%n%n", conta.getNumConta(), conta.getNomTitConta(), conta.getValorConta());
		

	}

}
