// Programa 22 - Leia um valor de comprimento em jardas e apresente-o convertido em metros.
// A fórmula de conversão é: M = 0.91*J, sendo J o comprimento em jardas e M o comprimento em metros.

package exercicio22;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual o valor de comprimento em jardas ? ");
		float J = in.nextFloat();
		double M = (J*0.91);
		System.out.printf("O comprimento em metros é: %.2f", M);
		

	}

}
