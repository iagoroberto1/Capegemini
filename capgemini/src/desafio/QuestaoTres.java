package desafio;

import java.io.PrintStream;
import java.util.Scanner;

public class QuestaoTres {

  public static void main(String[] args) {
    try {
    	QuestaoTres programa = new QuestaoTres();
      programa.executar();
    } catch (Throwable t) {
      t.printStackTrace();
    }
  }

  private static final Scanner in = new Scanner(System.in);
  private static final PrintStream out = System.out;

  public void executar() {
    
    out.println("Digite a frase que deseja criptografar: ");
    String frase = in.nextLine();
    String fraseSemEspacos = frase.replaceAll("\\s+", "");

    char[][] matriz = criarMatriz(fraseSemEspacos);
    imprimirMatriz(matriz);

    String fraseEncriptada = textoEncriptado(matriz);
    out.println("Frase Criptografada: \"" + fraseEncriptada + "\"");
  }

  private char[][] criarMatriz(String texto) {
    char[] letras = texto.toCharArray();
    int tamanho = letras.length;
    int raizQuadrada = (int) Math.ceil(Math.sqrt(tamanho));
    int colunas = raizQuadrada;
    int linhas = (int) Math.ceil(tamanho / (double) colunas);
    char[][] matriz = new char[linhas][colunas];
    int lin = 0;
    int col = 0;
    for (int i = 0; i < tamanho; i++) {
      matriz[lin][col] = letras[i];
      col++;
      if (col % colunas == 0) {
        col = 0;
        lin++;
      }
    }
    return matriz;
  }

  private void imprimirMatriz(char[][] matriz) {
    for (int lin = 0; lin < matriz.length; lin++) {
      for (int col = 0; col < matriz[lin].length; col++) {
        out.print(" " + matriz[lin][col]);
      }
      out.println();
    }
  }

  private String textoEncriptado(char[][] matriz) {
    StringBuilder texto = new StringBuilder();
    for (int col = 0; col < matriz[0].length; col++) {
      for (int lin = 0; lin < matriz.length; lin++) {
        char letra = matriz[lin][col];
        if (letra > 0) {
          texto.append(letra);
        }
      }
      texto.append(" ");
    }
    return texto.toString().trim();
  }
}
