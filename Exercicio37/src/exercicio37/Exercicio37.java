// Programa 37 - Façaa um programa que leia o valor de um produto e imprima o valor com desconto, tendo em vista que o desconto foi de 12%.

package exercicio37;

import java.util.Scanner;

public class Exercicio37 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual o valor do produto? ");
		float p = in.nextFloat();
		double d = (p - (p*0.12));
		System.out.printf("Com o desconto de 12 por cento, valerá: R$ %.2f", d);
		

	}

}
