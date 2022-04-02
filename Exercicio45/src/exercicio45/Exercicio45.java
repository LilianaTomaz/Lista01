// Programa 45 - Faça um programa para converter uma letra maiuscula em letra minuscula. Use a tabela ASCII para resolver o problema.

package exercicio45;

import java.util.Scanner;

public class Exercicio45 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite uma letra maiúscula entre 'A' e 'Z': ");
		int a1 = in.next().charAt(0);
		
		System.out.println("A letra minúscula correspondente "+(char)a1+", na tabela ASCII é: "+(char)(a1+32));
					
		
		
	}
}