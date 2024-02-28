package lacos_repeticao;

import java.util.Scanner;

public class ExRepeticao6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float num;
		float soma = 0;
		int contador=0;
		do {
			System.out.println("Digite um número:");
			num = scan.nextInt();
			if ((num % 3)==0 && num!=0) {
				soma = soma + num;
				contador++;
			}
			
		} while (num != 0);
		float media = soma/contador;
		System.out.println("A soma dos valores positivos foi: " + media);
		scan.close();

	}

}
