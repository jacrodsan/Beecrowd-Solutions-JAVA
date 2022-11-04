package exercicios;
import java.util.Scanner;
public class beecrowd1018 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int notas = teclado.nextInt();
		int X;
		X = notas;
		int notas100, notas50, notas20, notas10, notas5, notas2, notas1;
		
		notas100 = X/100;
		X -= notas100 * 100;
		notas50 = X/50;
		X -= notas50 * 50;
		notas20 = X/20;
		X -= notas20 * 20;
		notas10 = X/10;
		X -= notas10 * 10;
		notas5 = X/5;
		X -= notas5 * 5;
		notas2 = X/2;
		X -= notas2 * 2;
		notas1 = X;
		
		
		System.out.println(notas);
		System.out.println( notas100 + " nota(s) de R$ 100,00");
		System.out.println( notas50 + " nota(s) de R$ 50,00");
		System.out.println( notas20 + " nota(s) de R$ 20,00");
		System.out.println( notas10 + " nota(s) de R$ 10,00");
		System.out.println( notas5 + " nota(s) de R$ 5,00");
		System.out.println( notas2 +" nota(s) de R$ 2,00");
		System.out.println(notas1 + " nota(s) de R$ 1,00");
	}

}
