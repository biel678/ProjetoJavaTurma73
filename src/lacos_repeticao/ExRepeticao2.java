package lacos_repeticao;

import java.util.Scanner;

public class ExRepeticao2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num, par, impar;
		par = 0;
		impar = 0;
		for (int cont = 0; cont < 10; cont++) {
			System.out.println("Digite um número:");
			num = scan.nextInt();
			if ((num % 2) == 0) {
				par++;
			} else {
				impar++;
			}
		}
		System.out.println("Total de números pares: " + par);
		System.out.println("Total de números ímpares: " + impar);
		scan.close();
	}

}
