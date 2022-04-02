// Programa 43 - Escreva um programa de ajuda para vendedores. A partir de um valor total lido, mostre:
// o total a pagar com desconto de 10%; o valor de cada parcela, no parcelamento de 3× sem juros; 
// a comissao do vendedor, no caso da venda ser a vista (5% sobre o valor com desconto).

package exercicio43;

import java.util.Scanner;

public class Exercicio43 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual o valor do produto? ");
		float p = in.nextFloat();
		float d = p - (p*10/100);
		float par = (d/3);
		double c = (d*0.05);
		System.out.printf("O total a pagar com desconto de 10 por cento é: R$ %.2f",d); 
		System.out.printf("\nCaso deseje parcelar em 3x, cada parcela vale: R$ %.2f",par);
		System.out.printf("\nA comissão do vendedor na venda do produto a vista é: R$ %.2f",c);
		

	}

}
