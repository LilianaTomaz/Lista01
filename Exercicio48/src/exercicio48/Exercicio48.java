// Programa 48 - Leia um valor inteiro em segundos, e imprima-o em horas, minutos e segundos.

package exercicio48;

import java.util.Scanner;

public class Exercicio48 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um valor em segundos: ");
		int s = in.nextInt();
		
		int h = s / 3600;
		int m = (s % 3600) / 60;
		int s1 = (s % 3600) % 60;
		
		System.out.println("O valor em horas, minutos e segundos é: "+h+" horas, "+m+" minutos e "+s1+" segundos.");

	}

}
