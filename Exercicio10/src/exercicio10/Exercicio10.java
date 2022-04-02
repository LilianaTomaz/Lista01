// Programa 10 - Leia uma velocidade em km/h (quilometros por hora) e apresente-a convertida em m/s (metros por segundo). 
// A formula de conversão é: M = K/3.6, sendo K a velocidade em km/h e M em m/s.

package exercicio10;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual a velocidade em km/h ?");
		float K = in.nextFloat();
		double M = (K/3.6);
		System.out.printf("A velocidade em m/s é: %.2f", M);
		
		

	}

}
