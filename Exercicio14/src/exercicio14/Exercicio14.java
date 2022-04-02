// Programa 14 - Leia um angulo em graus e apresente-o convertido em radianos.
// A fórmula de conversão é: R = G * π/180, sendo G o angulo em graus e R em radianos e π = 3.14

package exercicio14;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um ângulo em graus: ");
		int G = in.nextInt();
		double R = (G*3.14/180);
		System.out.printf("O ângulo em radianos é: %.2f", R);

	}

}
