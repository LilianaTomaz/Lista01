// Programa 16 - Leia um valor de comprimento em polegadas e apresente-o convertido em centímetros.
// A fórmula de conversão é: C = P * 2,54, sendo C o comprimento em centímetros e P o comprimento em polegadas.

package exercicio16;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual o comprimento em polegadas? ");
		float P = in.nextFloat();
		double C = (P*2.54);
		System.out.printf("O valor do comprimeiro em centímetros é: %.2f", C);

	}

}
