// Programa 32 - Leia um numero inteiro e imprima a soma do sucessor de seu triplo com o antecessor de seu dobro.
// n = n�mero; t = triplo do numero; st = sucessor do triplo; d = dobro do numero; ad = antecessor do dobro.

package exercicio32;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Digite um n�mero Inteiro: ");
		int n = in.nextInt();
		int t = (n*3);
		int st = (t+1);
		int d = (n*2);
		int ad = (d-1);
		int s = (st+ad);
		System.out.println("O dobro do n�mero �: "+d+" e o antecessor desse dobro �: "+ad+"\nO triplo do n�mero �: "+t+" e o sucessor desse tiplo �: "+st+""
				+ "\nA soma do sucessor de seu triplo com o antecessor do seu dobro �: "+s);

	}

}
