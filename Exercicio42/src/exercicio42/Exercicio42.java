// Programa 42 - Receba o salario-base de um funcion�rio. Calcule e imprima o sal�rio a receber, sabendo-se que esse funcionario tem
// uma gratifica��o de 5% sobre o sal�rio-base. Al�m disso, ele paga 7% de imposto sobre o salario-base.

package exercicio42;

import java.util.Scanner;

public class Exercicio42 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Qual o sal�rio-base do funcion�rio? ");
		float sb = in.nextFloat();
		double sg = sb + (sb*0.05);
		double si = sb - (sb*0.07);
		double sf = sb + sg - si;
		System.out.printf("O sal�rio que o funcion�rio ir� receber com gratifica��o e imposto �: R$ %.2f", sf);
		

	}

}