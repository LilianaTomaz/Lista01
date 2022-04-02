// Programa 33 - Leia o tamanho do lado de um quadrado e imprima como resultado a sua area.

package exercicio33;

import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual o tamanho do lado do quadrado? ");
		float x = in.nextFloat();
		float a = (x*x);
		System.out.printf("A área do quadrado é: %.2f",a);
		

	}

}
