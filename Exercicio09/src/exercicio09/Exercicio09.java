// Programa 9 - Leia uma temperatura em graus Celsius e apresente-a convertida em graus Kelvin. 
// A formula de conversão é: K = C + 273.15, sendo C a temperatura em Celsius e K a temperatura em Kelvin.

package exercicio09;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual a temperatura atual em graus Celsius? ");
		float C = in.nextFloat();
		double K = (C+273.15);
		System.out.printf("A temperatura em graus Kelvin é: %.2f", K);

	}

}
