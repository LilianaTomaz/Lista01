// Programa 38 - Leia o salario de um funcionário. Calcule e imprima o valor do novo salário, sabendo que ele recebeu um aumento de 25%.

package exercicio38;

import java.util.Scanner;

public class Exercicio38 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual o salário do funcionário? ");
		float s = in.nextFloat();
		double a = (s +(s*0.25));
		System.out.printf("O salário atualizado com o aumento de 25 por cento, ficará: R$ %.2f",a);
		

	}

}
