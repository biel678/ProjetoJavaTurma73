package lacos_repeticao;

import java.util.Scanner;

public class ExRepeticao5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		int soma = 0;
		do {
			System.out.println("Digite um número:");
			num = scan.nextInt();
			if (num > 0) {
				soma = soma + num;
			}
		} while (num != 0);
		System.out.println("A soma dos valores positivos foi: " + soma);
		scan.close();
	}

}
