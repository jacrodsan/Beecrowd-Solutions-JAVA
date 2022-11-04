package exercicios;
import java.util.Scanner;

public class beecrowd1075 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int N = teclado.nextInt();
		
		for(int i = 1; i<=10000; i++) {
			if(i%N == 2) {
				System.out.println(i);
			}
		}
	}

}
