package exercicios;

import java.util.Scanner;

public class beecrowd1094 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int x, n, totalCobaias = 0, totalCoelhos = 0, totalRatos = 0, totalSapos = 0;
		double pRat = 0, pSap = 0, pCoel = 0;
		String animal;

		n = teclado.nextInt();

		for (int i = 1; i <= n; i++) {
			x = teclado.nextInt();
			animal = teclado.next();
			totalCobaias += x;

			if (animal.equals("C")) {
				totalCoelhos += x;
			} else if (animal.equals("R")) {
				totalRatos += x;
			} else if (animal.equals("S")) {
				totalSapos += x;
			}

			pRat = (double) (totalRatos * 100) / totalCobaias;
			pSap = (double) (totalSapos * 100) / totalCobaias;
			pCoel = (double) (totalCoelhos * 100) / totalCobaias;
		}

		System.out.println("Total: " + totalCobaias + "cobaias");
		System.out.println("Total de coelhos:" + totalCoelhos);
		System.out.println("Total de ratos:" + totalRatos);
		System.out.println(":Total de sapos: " + totalSapos);

		System.out.printf("Percentual de coelhos: %.2f", pCoel);
		System.out.println("%\n");
		System.out.printf("Percentual de ratos: %.2f", pRat);
		System.out.println("%\n");
		System.out.printf("Percentual de sapos: %.2f", pSap);
		System.out.println("%\n");

		teclado.close();

	}
}
