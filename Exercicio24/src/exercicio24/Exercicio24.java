// Programa 24 - Leia um valor de area em metros quadrados m² e apresente-o convertido em acres.
// A fómula de conversão é: A = M*0.000247, sendo M a area em metros quadrados e A a area em acres.

package exercicio24;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual o valor da área em m²? ");
		float M = in.nextFloat();
		double A = (M*0.000247);
		System.out.printf("O valor da área em acres é: %.2f", A);
		

	}

}
