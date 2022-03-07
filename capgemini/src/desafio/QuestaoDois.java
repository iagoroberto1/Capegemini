package desafio;

import java.util.Scanner;

public class QuestaoDois {

	public static void main(String[] args) {
		
		 
		try (Scanner sc = new Scanner(System.in)) {
			int A, B, C;
			
			
			System.out.println("Quantos números deseja informar? ");
			C = sc.nextInt();
			
			int[] vet = new int[C];
			
			for (A = 0; A < C; A++) {
				System.out.println("Digite um número: ");
				vet[A] = sc.nextInt();
			}
			System.out.println("Digite um valor para x: ");
			B = sc.nextInt();
			
			       sc.close();
		}
	}
}
