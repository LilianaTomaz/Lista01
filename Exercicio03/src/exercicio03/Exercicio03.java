// Programa 3 - Peça ao usuário para digitar três valores interios e imprima a soma deles.

package exercicio03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o primeiro valor: ");
		int x = in.nextInt();  
		System.out.println("Digite o segundo valor: ");
		int y = in.nextInt(); 
		System.out.println("Digite o terceiro valor: ");
		int z = in.nextInt();
		
		int soma = (x+y+z);
		
		System.out.println("O valor da soma dos valores é: "+soma);

	}

}
