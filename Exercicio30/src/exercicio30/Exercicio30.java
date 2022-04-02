// Programa 30 - Leia um valor em real e a cotação do dólar. Em seguida, imprima o valor correspondente em dólares.

package exercicio30;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual o valor em real? ");
		float r = in.nextFloat();
		//neste exercicio o valor do dolar é: R$5,00
		float d = (r/5);
		System.out.printf("O valor em dólar é: R$ %.2f",d);
		

	}

}
