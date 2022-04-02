// Programa 42 - Receba o salario-base de um funcionário. Calcule e imprima o salário a receber, sabendo-se que esse funcionario tem
// uma gratificação de 5% sobre o salário-base. Além disso, ele paga 7% de imposto sobre o salario-base.

package exercicio42;

import java.util.Scanner;

public class Exercicio42 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Qual o salário-base do funcionário? ");
		float sb = in.nextFloat();
		double sg = sb + (sb*0.05);
		double si = sb - (sb*0.07);
		double sf = sb + sg - si;
		System.out.printf("O salário que o funcionário irá receber com gratificação e imposto é: R$ %.2f", sf);
		

	}

}