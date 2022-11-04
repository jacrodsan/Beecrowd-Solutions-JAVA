package exercicios;
import java.util.Scanner;
public class beecrowd1019 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int N = teclado.nextInt();
		int horas, segundos, minutos;
		
		horas = N/3600;
		N -= horas*60*60;
		minutos = N/60;
		N -= minutos*60;
		segundos = N;
		
		System.out.println(horas +":"+ minutos +":"+ segundos);
	}

}
