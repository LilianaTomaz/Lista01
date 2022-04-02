// Programa 46 - Faça um programa que leia um numero inteiro positivo de três dígitos (de 100 a 999).
// Gere outro numero formado pelos dígitos invertidos do numero lido.

package exercicio46;

import java.util.Scanner;

public class Exercicio46 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um número de 3 digitos: ");
		int numero = Integer.parseInt(in.nextLine());
	    int inverso = 0, temp;
	    while(numero != 0){ 
	    	temp = numero % 10;
	    	inverso = inverso * 10 + temp;
	    	numero = numero / 10;
	    }
	    
	    System.out.println("O número invertido é " + inverso);
	    
	    }
		

	}
