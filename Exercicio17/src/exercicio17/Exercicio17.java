// Programa 17 - Leia um valor de comprimento em cent�metros e apresente-o convertido em polegadas.
// A formula de convers�o �: P = C/2,54 , sendo C o comprimento em cent�metros e P o comprimento em polegadas.

package exercicio17;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual o valor do comprimento em cent�metros? ");
		float C = in.nextFloat();
		double P = (C/2.54);
		System.out.printf("O valor em polegadas �: %.2f", P);

	}

}
