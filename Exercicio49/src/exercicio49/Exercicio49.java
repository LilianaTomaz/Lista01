// Programa 49 - Fa�a um programa que leia o horario (hora, minuto e segundo) de inicio e a dura��o, em segundos,
// de uma experiencia biol�gica. O programa deve resultar com o novo hor�rio (hora, minuto e segundo) do termino da mesma.

package exercicio49;

import java.util.Scanner;

public class Exercicio49 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite a hora de in�cio da experi�ncia: ");
		int hi = in.nextInt();
		System.out.print("Digite os minutos de in�cio da experi�ncia: ");
		int mi = in.nextInt();
		System.out.println("Digite os segundos de in�cio da experi�ncia: ");
		int si = in.nextInt();
		System.out.println("Digite o tempo de dura��o da experi�ncia em segundos: ");
		int td = in.nextInt();
		
		int h = hi / 3600;
        int m = (hi % 3600) / 60;
        int s = (hi % 3600) % 60;			
        
        int hf = h + hi;
        int mf = m + mi;
        int sf = s + si;

        System.out.printf("O t�rmino da experi�ncia ocorrer� em: "+hf+" horas, "+mf+" minutos e "+sf+" segundos.");

        
	}
}