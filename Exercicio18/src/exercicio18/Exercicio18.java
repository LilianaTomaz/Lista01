// Programa 18 - Leia um valor de volume em metros c�bicos m3 e apresente-o convertido em litros.
// A f�rmula de convers�o �: L = 1000 * M, sendo L o volume em litros e M o volume em metros c�bicos.

package exercicio18;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o valor em metros c�bicos: ");
		float M = in.nextFloat();
		double L = (1000*M);
		System.out.printf("O valor em litros �: %.2f", L);

	}

}
