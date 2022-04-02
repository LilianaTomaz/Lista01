// Programa 28 - Façaa a leitura de tres valores e apresente como resultado a soma dos quadrados dos tres valores lidos.

package exercicio28;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio28 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o primeiro valor: ");
		int x = in.nextInt();
		System.out.println("Digite o segundo valor: ");
		int y = in.nextInt();
		System.out.println("Digite o terceiro valor: ");
		int z = in.nextInt();
		double x1 = Math.pow (x, 2);
		double y1 = Math.pow(y, 2);
		double z1 = Math.pow(z, 2);
		double s = (x1+y1+z1);
		System.out.println("O quadrado de "+x+" é: "+x1+". O quadrado de "+y+" é : "+y1+". O quadrado de "+z+" é : "+z1+". "
				+ "\nE a soma dos quadrados dos valores lidos é: "+s);
		
	}

}
