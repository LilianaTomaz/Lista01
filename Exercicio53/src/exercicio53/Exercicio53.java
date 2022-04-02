// Programa 53 - Faça um programa para ler as dimensoes de um terreno (comprimento c e largura l),bem como o preço do metro de tela p.
// Imprima o custo para cercar este mesmo terreno com tela.

package exercicio53;

import java.util.Scanner;

public class Exercicio53 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual o comprimento do terreno em metros? ");
		float c = in.nextFloat();
		System.out.println("Qual a largura do terreno em metros? ");
		float l = in.nextFloat();
		System.out.println("Qual o preço do metro de tela? ");
		float p = in.nextFloat();
		
		float a = (c * l * p);
		System.out.printf("O custo para cercar este terreno será: R$%.2f",a);

	}

}
