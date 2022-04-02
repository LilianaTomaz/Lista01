// Programa 52 - Tres amigos jogaram na loteria. Caso eles ganhem, o premio deve ser repartido proporcionalmente ao valor que
// cada um deu para a realizaçao da aposta. Faça um programa que leia quanto cada apostador investiu, o valor do premio, 
// e imprima quanto cada um ganharia do premio com base no valor investido.

package exercicio52;

import java.util.Scanner;

public class Exercicio52 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual o valor que o primeiro apostador deu para realizar a aposta? ");
		float v1 = in.nextFloat();
		System.out.println("Qual o valor que o segundo apostador deu para realizar a aposta? " );
		float v2 = in.nextFloat();
		System.out.println("Qual o valor que o terceiro apostador deu para realizar a aposta? ");
		float v3 = in.nextFloat();
		System.out.println("Qual o valor do prêmio? ");
		float vp = in.nextFloat();
		
		float tp = v1 + v2 + v3;

        float p1 = v1 / tp;
        float p2 = v2 / tp;
        float p3 = v3 / tp;

        float r1 = (vp * p1);
        float r2 = (vp * p2);
        float r3 = (vp * p3);
		
	    System.out.printf("O primeiro apostador ganhará: R$ %.2f",r1);
	    System.out.printf("\nO segundo apostador ganhará: R$ %.2f",r2);
	    System.out.printf("\nO terceiro apostador ganhará: R$ %.2f",r3);

	}

}