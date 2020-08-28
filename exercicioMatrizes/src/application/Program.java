package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two values for row e column numbers respectively: ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] mat = new int[n][m];
		
		for(int i = 0; i<n; i++) {
			for(int j = 0; j < m; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.printf("%d",mat[i][j]);
			}
			
		}
		System.out.println("Digite um valor para saber posição");
		int x = sc.nextInt();
		for(int i = 0; i< n; i++) {
			for(int j = 0; j < m; j++) {
				if(x == mat[i][j]) {
					System.out.println("Position "+ i+"," + j);
					
					if(j > 0) {
						System.out.println("Left: "+ mat[i][j-1]);
					}
					if(i > 0) {
						System.out.println("Up: "+ mat[i-1][j]);
					}
					if(j < mat[i].length-1) {
						System.out.println("Right: "+ mat[i][j+1]);
					}
					if(i < 	mat.length-1) {
						System.out.println("Down: "+ mat[i+1][j]);
					}
					
					
				}
			}
		}
		
		
		
		
		
		
		sc.close();

	}

}
