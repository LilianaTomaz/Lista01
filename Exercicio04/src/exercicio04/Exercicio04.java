// Programa 4 - Leia um n�mero real e imprima o resultado do quadrado desse n�umero.

package exercicio04;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um n�mero Real: ");
		float x = in.nextFloat();
		double q = Math.pow(x,2);
		System.out.printf("O quadrado desse n�mero �: %.2f", q);

	}

}
