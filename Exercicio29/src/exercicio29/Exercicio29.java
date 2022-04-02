// Programa 29 - Leia quatro notas, calcule a media aritmética e imprima o resultado.

package exercicio29;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual o valor da nota 1? ");
		float n1 = in.nextFloat();
		System.out.println("Qual o valor da nota 2? ");
		float n2 = in.nextFloat();
		System.out.println("Qual o valor da nota 3? ");
		float n3 = in.nextFloat();
		System.out.println("Qual o valor da nota 4? ");
		float n4 = in.nextFloat();
		float m = ((n1+n2+n3+n4)/4);
		System.out.printf("A média aritmética das notas é: %.2f",m);
		

	}

}
