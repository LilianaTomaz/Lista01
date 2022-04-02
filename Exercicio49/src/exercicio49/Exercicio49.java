// Programa 49 - Faça um programa que leia o horario (hora, minuto e segundo) de inicio e a duração, em segundos,
// de uma experiencia biológica. O programa deve resultar com o novo horário (hora, minuto e segundo) do termino da mesma.

package exercicio49;

import java.util.Scanner;

public class Exercicio49 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite a hora de início da experiência: ");
		int hi = in.nextInt();
		System.out.print("Digite os minutos de início da experiência: ");
		int mi = in.nextInt();
		System.out.println("Digite os segundos de início da experiência: ");
		int si = in.nextInt();
		System.out.println("Digite o tempo de duração da experiência em segundos: ");
		int td = in.nextInt();
		
		int h = hi / 3600;
        int m = (hi % 3600) / 60;
        int s = (hi % 3600) % 60;			
        
        int hf = h + hi;
        int mf = m + mi;
        int sf = s + si;

        System.out.printf("O término da experiência ocorrerá em: "+hf+" horas, "+mf+" minutos e "+sf+" segundos.");

        
	}
}