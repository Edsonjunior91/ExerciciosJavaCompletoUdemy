package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Room;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Room[] vect = new Room[10];
		
		System.out.println("How Many rooms will be rented?");
		int n = sc.nextInt();
		
		
		for(int i = 1; i<=n; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.printf("Room: ");
			int room = sc.nextInt();
			vect[room]=new Room(name, email);	
		}
		System.out.println();
		System.out.println("Busy rooms:");
		
		for(int i =0; i<10; i++) {
			
			if(vect[i] != null) {
				
				System.out.println(i +": " + vect[i]);
			}
		}
		

	}

}