// Programa 26 - Leia um valor de area em metros quadrados m� e apresente-o convertido em hectares.
// A f�rmula de convers�o �: H = M*0.0001, sendo M a area em m� e H a area em hectares.

package exercicio26;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual o valor da �rea em m�? ");
		float M = in.nextFloat();
		double H = (M*0.0001);
		System.out.printf("O valor da �rea em hectares �: %.2f", H);
		

	}

}
