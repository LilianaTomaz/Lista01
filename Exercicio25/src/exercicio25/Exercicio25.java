// Programa 25 - Leia um valor de area em acres e apresente-o convertido em metros quadrados m²
// A fórmula de conversão é: M = A*4048.58, sendo M a area em m² e A a area em acres. 

package exercicio25;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual o valor da área em acres? ");
		float A = in.nextFloat();
		double M =  (A*4048.58);
		System.out.printf("O valor da área em m² é: %.2f",M);
		
	}

}
