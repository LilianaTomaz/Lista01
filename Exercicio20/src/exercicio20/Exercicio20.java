// Programa 20 - Leia um valor de massa em quilogramas e apresente-o convertido em libras.
// A f�rmula de convers�o �: L = K/0,45 , sendo K a massa em quilogramas e L a massa em libras.


package exercicio20;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual o valor da massa em quilogramas? ");
		float K = in.nextFloat();
		double L = (K/0.45);
		System.out.printf("O valor da massa em Libras �: %.2f", L);
		

	}

}
