// Programa 12 - Leia uma distancia em milhas e apresente-a convertida em quilômetros. 
// A fómula de conversão é: K = 1,61 * M, sendo K a distancia em quilômetros e M em milhas.

package exercicio12;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual a distância em milhas?");
		float M = in.nextFloat();
		double K = (1.61*M);
		System.out.printf("A distância em quilômetros é: %.2f", K);
	}

}
