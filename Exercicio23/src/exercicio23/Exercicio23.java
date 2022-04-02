// Programa 23 - Leia um valor de comprimento em metros e apresente-o convertido em jardas.
// A fórmula de conversão é: J = M/0.91, sendo J o comprimento em jardas e o M o comprimento em metros. 

package exercicio23;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual o valor do comprimento em metros? ");
		float M = in.nextFloat();
		double J = (M/0.91);
		System.out.printf("O valor do comprimento em jardas é: %.2f", J);
		

	}

}
