//Fa�a um programa que leia um n�mero real e o imprima.

package exercicio02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um n�mero Real: ");
		float x = in.nextFloat();
		System.out.printf("%.2f", x);

	}

}
