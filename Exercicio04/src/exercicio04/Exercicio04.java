// Programa 4 - Leia um número real e imprima o resultado do quadrado desse núumero.

package exercicio04;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um número Real: ");
		float x = in.nextFloat();
		double q = Math.pow(x,2);
		System.out.printf("O quadrado desse número é: %.2f", q);

	}

}
