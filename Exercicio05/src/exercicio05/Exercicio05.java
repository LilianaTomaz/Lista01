// Programa 5 - Leia um npumero real e imprima a quinta parte deste número.

package exercicio05;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um número Real: ");
		float x = in.nextFloat();
		float d = (x/5);
		System.out.printf("A quinta parte deste número é: %.2f", d);
		

	}

}
