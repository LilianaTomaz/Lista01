// Programa 6 - Leia uma temperatura em graus Celsius e apresente-a convertida em graus Fahrenheit.
// A formula de conversão é: F = C∗(9.0/5.0)+32.0, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.

package exercicio06;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual a temperatura em graus Celsius ? ");
		int C = in.nextInt();
		double F = (C*(9.0/5.0)+32.0);
		System.out.printf("A temperatura em graus Fahrenheit é: %.2f", F);
		

	}

}
