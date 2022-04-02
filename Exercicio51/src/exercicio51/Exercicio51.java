// Programa 51 - Escreva um programa que leia as coordenadas x e y de pontos no R² e calcule sua distancia da origem (0, 0).

package exercicio51;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio51 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite a coordenada x: ");
		float x = in.nextFloat();
		System.out.println("Digite a coordenada y: ");
		float y = in.nextFloat();
		double w = (Math.pow(x,2)+Math.pow(y,2));
		double z = Math.sqrt(w);
		System.out.printf("A distância da origem (0,0) é: %.2f",z);
		
		
		

	}

}
