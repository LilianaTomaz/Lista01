// Programa 12 - Leia uma distancia em milhas e apresente-a convertida em quil�metros. 
// A f�mula de convers�o �: K = 1,61 * M, sendo K a distancia em quil�metros e M em milhas.

package exercicio12;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual a dist�ncia em milhas?");
		float M = in.nextFloat();
		double K = (1.61*M);
		System.out.printf("A dist�ncia em quil�metros �: %.2f", K);
	}

}
