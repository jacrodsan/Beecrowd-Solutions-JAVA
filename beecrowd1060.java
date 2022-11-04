package exercicios;

import java.util.Scanner;
public class beecrowd1060 {

	public static void main(String[] args) {
		
		int cont = 0;
		Scanner teclado = new Scanner(System.in);
		for(double i =1; i< 7; i ++) {
			double valor = teclado.nextInt();
			if(valor%2 ==0) {
				cont =cont + 1;
				System.out.println(cont + " valores positivos");
			}
		}
		teclado.close();
	}

}
