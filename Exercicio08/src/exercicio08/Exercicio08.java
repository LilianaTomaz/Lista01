// Programa 8 - Leia uma temperatura em graus Kelvin e apresente-a convertida em graus Celsius. 
// A formula de conversão é: C = K − 273.15, sendo C a temperatura em Celsius e K a temperatura em Kelvin.

package exercicio08;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual a temperatura atual em graus Kelvin? ");
		float K = in.nextFloat();
		double C = (K-273.15);
		System.out.printf("A temperatura em graus Celsius é: %.2f", C);
		

	}

}
