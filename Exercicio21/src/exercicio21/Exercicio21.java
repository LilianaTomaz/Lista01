// Programa 21 - Leia um valor de massa em libras e apresente-o convertido em quilogramas.
// A fórmula de conversão é: L = K*0.45, sendo K a massa em quilogramas e L a massa em libras.

package exercicio21;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual o valor da massa em quilogramas ?");
		float K = in.nextFloat();
		double L = (K*0.45);
		System.out.printf("O valor da massa em libras é: %.2f", L);

	}

}
