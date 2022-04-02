// Programa 50 - Implemente um programa que calcule o ano de nascimento de uma pessoa a partir de sua idade e do ano atual.

package exercicio50;

import java.util.Scanner;

public class Exercicio50 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Digite sua idade, ou idade que irá fazer esse ano: ");
		int idade = in.nextInt();
		System.out.println("Qual o ano atual? ");
		int ano = in.nextInt();
		int nas = ano - idade;
		
		System.out.println("Você nasceu no ano: "+nas);
		
	}

}
