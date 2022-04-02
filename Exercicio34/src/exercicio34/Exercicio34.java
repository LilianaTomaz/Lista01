// Programa 34 - Leia o valor do raio de um círculo e calcule e imprima a area do círculo correspondente.
// A area do circulo é pi*raio². considere pi = 3.141592.

package exercicio34;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio34 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual o valor do raio do círculo? ");
		float r = in.nextFloat();
		double pi = 3.141592;
		double r2 = Math.pow(r,2);
		double a = (pi*r2);
		System.out.printf("A área do círculo é: %.2f",a);
		

	}

}
