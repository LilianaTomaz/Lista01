// Programa 35 - Fa�a um programa que receba os valores de a e b e calcule o valor da hipotenusa atraves da equa��oo. 
// Imprima o resultado dessa opera��o. Sejam a e b os catetos de um triangulo, onde a hipotenusa � obtida pela equa��o:
// hipotenusa = raiz quadrada de a�+b�.

package exercicio35;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio35 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual o valor do primeiro cateto do tri�ngulo? ");
		float a = in.nextFloat();
		System.out.println("Qual o valor do segundo cateto? ");
		float b = in.nextFloat();
		double a2 = Math.pow(a, 2);
		double b2 = Math.pow(b, 2);
		double x = (a2+b2);
		double h = Math.sqrt(x);
		System.out.printf("O valor da hipotenusa �: %.2f",h);
		

	}

}
