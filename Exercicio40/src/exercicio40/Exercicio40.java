// Programa 40 - Uma empresa contrata um encanador a R$ 30,00 por dia. Façaa um programa que solicite o número de dias trabalhados
//pelo encanador e imprima a quantia líquida que devera ser paga, sabendo-se que sao descontados 8% para imposto de renda.

package exercicio40;

import java.util.Scanner;

public class Exercicio40 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Quantos dias o encanador trabalhou? ");
		float x = in.nextFloat();
		double y = (30.*0.08);
		double s = x*(30-y);
		System.out.printf("A quantia líquida que deverá ser paga é: R$ %.2f", s);
		

	}

}
