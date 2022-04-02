//Leia uma velocidade em m/s (metros por segundo) e apresente-a convertida em km/h(quilometros por hora).
// A fóormula de conversão é: K = M * 3.6, sendo K a velocidade em km/h e M em m/s.

package exercicio11;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual a velocidade em m/s?");
		float M = in.nextFloat();
		double K = (M*3.6);
		System.out.printf("A velocidade em km/h é: %.2f",K);

	}

}
