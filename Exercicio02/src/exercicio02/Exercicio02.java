//Faça um programa que leia um número real e o imprima.

package exercicio02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um número Real: ");
		float x = in.nextFloat();
		System.out.printf("%.2f", x);

	}

}
