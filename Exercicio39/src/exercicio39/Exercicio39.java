// Programa 39 - A importancia de R$ 780.000,00 será dividida entre três ganhadores de um concurso. Sendo que da quantia total:
// O primeiro ganhador recebera 46%; O segundo recebera 32%; O terceiro recebera o restante;
// Calcule e imprima a quantia ganha por cada um dos ganhadores.

package exercicio39;

import java.util.Scanner;

public class Exercicio39 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double v = 780000.00;
		double p1 = v - (v*0.46);
		double p2 = p1 - (p1*0.32);
		double p3 = v - p1 - p2;
		System.out.printf("O primeiro ganhador receberá 46 por cento do valor que é: R$ %.2f",p1);
		System.out.printf("\nO segundo ganhador receberá 32 por cento do valor que é: R$ %.2f",p2);
		System.out.printf("\nO terceiro ganhador receberá o restante que é: R$ %.2f",p3);
		

	}

}
