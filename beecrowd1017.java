package exercicios;
import java.util.Scanner;
public class beecrowd1017 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double tempoHoras = teclado.nextDouble();
		double velocidadeMedia = teclado.nextDouble();
		
		double calculocombustivel;
		calculocombustivel = (tempoHoras*velocidadeMedia)/12;
		
		System.out.println(String.format("%.3f", calculocombustivel));
	}

}
