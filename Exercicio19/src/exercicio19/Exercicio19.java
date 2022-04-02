// Programa 19 - Leia um valor de volume em litros e apresente-o convertido em metros cubicos m³
// A fórmula de conversão é: M = L/1000 , sendo L o volume em litros e M o volume em metros cubicos.

package exercicio19;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o em Litros: ");
		float L = in.nextFloat();
		double M = (L/1000);
		System.out.printf("O valor em metros cúbicos é: %.2f", M);
	

	}

}
