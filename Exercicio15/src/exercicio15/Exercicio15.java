// Programa 15 - Leia um angulo em radianos e apresente-o convertido em graus. 
// A fórmula de conversão é: G = R * 180/π, sendo G o angulo em graus e R em radianos e π = 3.14.

package exercicio15;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Diga um ângulo em radianos: ");
		float R = in.nextFloat();
		double G = (R*180/3.14);
		System.out.printf("O ângulo em graus é: %.2f", G);
		
	}

}
