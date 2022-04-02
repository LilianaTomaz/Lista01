// Programa 32 - Leia um numero inteiro e imprima a soma do sucessor de seu triplo com o antecessor de seu dobro.
// n = número; t = triplo do numero; st = sucessor do triplo; d = dobro do numero; ad = antecessor do dobro.

package exercicio32;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Digite um número Inteiro: ");
		int n = in.nextInt();
		int t = (n*3);
		int st = (t+1);
		int d = (n*2);
		int ad = (d-1);
		int s = (st+ad);
		System.out.println("O dobro do número é: "+d+" e o antecessor desse dobro é: "+ad+"\nO triplo do número é: "+t+" e o sucessor desse tiplo é: "+st+""
				+ "\nA soma do sucessor de seu triplo com o antecessor do seu dobro é: "+s);

	}

}
