package desafio;

import java.util.Scanner;

public class QuestaoUm {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos n�meros deseja informar? ");

        int quantidadeDeNumerosInformados = scanner.nextInt();
        double[] listaDeNumeros = new double[0];

        if (quantidadeDeNumerosInformados % 2 == 0) {
            System.out.println("\nVoc� informou uma lista de quantidade par de n�meros.");
            scanner.close();
        } else {
            listaDeNumeros = new double[quantidadeDeNumerosInformados];
            for (int i = 0; i < listaDeNumeros.length; i++) {
                System.out.print("Digite o " + (i + 1) + "� n�mero: ");
                listaDeNumeros[i] = scanner.nextDouble();
            }
        }
        int numerosEsquerda = 0;
        int numerosDireta = listaDeNumeros.length - 1;
        int mediaLista = (numerosEsquerda + numerosDireta) / 2;
        int medianaLista = (int) listaDeNumeros[mediaLista];
        System.out.println("A mediana da lista �: " + medianaLista);
        scanner.close();
    }
}
