// Programa 13 - Leia uma distancia em quil�metros e apresente-a convertida em milhas. 
// A f�rmula de convers�o �: M = K/1,61 , sendo K a distancia em quil�metros e M em milhas.

package exercicio13;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual a dist�ncia em Quil�metros?");
		float K = in.nextFloat();
		double M = (K/1.61);
		System.out.printf("A dist�ncia em Milhas �: %.2f", M);

	}

}
