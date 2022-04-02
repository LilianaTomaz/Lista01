// Programa 7 - Leia uma temperatura em graus Fahrenheit e apresente-a convertida em graus Celsius.
// A formula de conversão é:  C = 5.0 * (F − 32.0)/9.0, sendo C a temperatura em Celsius e F a temperatura em Fahrenheit.

package exercicio07;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual a temperatura atual em Fahrenheit ? ");
		float F = in.nextFloat();
		double C = (5.0*(F-32.0)/9.0);
		System.out.printf("A temperatura em graus Celsius é: %.2f", C);

	}

}
