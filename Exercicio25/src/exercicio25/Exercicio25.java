// Programa 25 - Leia um valor de area em acres e apresente-o convertido em metros quadrados m�
// A f�rmula de convers�o �: M = A*4048.58, sendo M a area em m� e A a area em acres. 

package exercicio25;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual o valor da �rea em acres? ");
		float A = in.nextFloat();
		double M =  (A*4048.58);
		System.out.printf("O valor da �rea em m� �: %.2f",M);
		
	}

}
