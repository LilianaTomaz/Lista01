// Programa 47 - Leia um numero inteiro de 4 dígitos (de 1000 a 9999) e imprima 1 dígito por linha.

package exercicio47;

import java.util.Scanner;

public class Exercicio47 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um número inteiro de quatro dígitos entre '1000' a '9999': ");
		int num = in.nextInt();
		int n1, n2, n3, n4;
		
		n1 = num % 10;
		num = num - n1;
		num = num / 10;
		
		n2 = num % 10;
		num = num - n2;
		num = num / 10;
		
		n3 = num % 10;
		num = num - n3;
		num = num / 10;
		
		n4 = num % 10;
		num = num - n4;
		num = num / 10;
		
		System.out.printf("O número digitado foi: \n"+n4+"\n"+n3+"\n"+n2+"\n"+n1);
		

	}

}
