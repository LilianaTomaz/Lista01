// Programa 31 - Leia um numero inteiro e imprima o seu antecessor e o seu sucessor.

package exercicio31;

import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um n�mero Inteiro: ");
		int x = in.nextInt();
		int a = (x-1);
		int s = (x+1);
		System.out.println("O antecessor do n�mero escolhido � "+a+" e o seu sucessor � "+s);
		

	}

}
