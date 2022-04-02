// Programa 36 - Leia a altura e o raio de um cilindro circular e imprima o volume do cilindro.
// O volume de um cilindro circular e calculado por meio da seguinte fóormula: V = pi*raio²*altura. Onde pi = 3.141592.

package exercicio36;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio36 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite a altura do cilindro: ");
		float a = in.nextFloat();
		System.out.println("Digite o raio do cilindro: ");
		float r = in.nextFloat();
		double pi = 3.141592;
		double r2 = Math.pow(r, 2);
		double V = (pi*r2*a);
		System.out.printf("O volume do cilindro é: %.2f",V);
		
		
	}

}
