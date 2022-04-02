// Programa 13 - Leia uma distancia em quilômetros e apresente-a convertida em milhas. 
// A fórmula de conversão é: M = K/1,61 , sendo K a distancia em quilômetros e M em milhas.

package exercicio13;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual a distância em Quilômetros?");
		float K = in.nextFloat();
		double M = (K/1.61);
		System.out.printf("A distância em Milhas é: %.2f", M);

	}

}
