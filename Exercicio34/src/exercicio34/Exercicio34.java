// Programa 34 - Leia o valor do raio de um c�rculo e calcule e imprima a area do c�rculo correspondente.
// A area do circulo � pi*raio�. considere pi = 3.141592.

package exercicio34;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio34 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual o valor do raio do c�rculo? ");
		float r = in.nextFloat();
		double pi = 3.141592;
		double r2 = Math.pow(r,2);
		double a = (pi*r2);
		System.out.printf("A �rea do c�rculo �: %.2f",a);
		

	}

}
