// Programa 27 - Leia um valor de area em hectares e apresente-o convertido em metros quadrados m�
// A f�rmula de convers�o �: M = H*10000, sendo M a area em m� e H a area em hectares.

package exercicio27;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual o valor da �rea em hectares? ");
		float H = in.nextFloat();
		double M = (H*10000);
		System.out.printf("O valor da �rea em m� �: %.2f",M);
		

	}

}
