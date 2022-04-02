// Programa 41 - Fac¸a um programa que leia o valor da hora de trabalho (em reais) e numero de horastrabalhadas no mes.
//Imprima o valor a ser pago ao funcionario, adicionando 10% sobre o valor calculado.

package exercicio41;

import java.util.Scanner;

public class Exercicio41 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual o valor da hora de trabalho? ");
		float vh = in.nextFloat();
		System.out.println("Quantas horas trabalhadas no mês? ");
		float h = in.nextFloat();
		double vp = (vh*h);
		double p = vp + (vp*0.10);
		System.out.printf("O valor a ser pago adicionando 10 por cento é: R$ %.2f",p);
		

	}

}
