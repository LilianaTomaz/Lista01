// Programa 16 - Leia um valor de comprimento em polegadas e apresente-o convertido em cent�metros.
// A f�rmula de convers�o �: C = P * 2,54, sendo C o comprimento em cent�metros e P o comprimento em polegadas.

package exercicio16;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual o comprimento em polegadas? ");
		float P = in.nextFloat();
		double C = (P*2.54);
		System.out.printf("O valor do comprimeiro em cent�metros �: %.2f", C);

	}

}
