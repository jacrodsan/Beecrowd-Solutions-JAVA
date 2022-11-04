package exercicios;
import java.util.Scanner;
public class beecrowd1020 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int dias = teclado.nextInt();
		
		int anos, messes;
		
		anos = dias/365;
		dias -= anos*365;
		messes = dias/30;
		dias -= messes*30;
		
		System.out.println( anos +" ano(s)\r\n"+ messes + " mes(es)\r\n"+ dias +" dia(s)");
		
	}

}
