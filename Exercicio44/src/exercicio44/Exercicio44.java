// Programa 44 - Receba a altura do degrau de uma escada e a altura que o usuario deseja alcan�ar subindo a escada.
// Calcule e mostre quantos degraus o usuario dever� subir para atingir seu objetivo.

package exercicio44;

import java.util.Scanner;

public class Exercicio44 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual a altura do degrau da escada? ");
		float d = in.nextFloat();
		System.out.println("Qual a altura voc� deseja alcan�ar subindo a escada? ");
		float a = in.nextFloat();
		float x = (a/d);
		System.out.println("voc� dever� subir "+x+" degraus para atingir seu objetivo.");

	}

}
