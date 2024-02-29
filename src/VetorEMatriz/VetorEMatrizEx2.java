package VetorEMatriz;

import java.util.Scanner;

public class VetorEMatrizEx2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int vetor[] = new int[10];
		float soma = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o valor do vetor " + i);
			vetor[i] = scan.nextInt();
		}

		System.out.println("Números nos índices ímpares:");
		for (int i = 0; i < 10; i++) {
			if ((i % 2) != 0) {
				System.out.println(vetor[i]);
			}
		}
		System.out.println("Números pares:");
		for (int i = 0; i < 10; i++) {
			if ((vetor[i] % 2) == 0) {
				System.out.println(vetor[i]);
			}
		}
		for (int i = 0; i < 10; i++) {
			soma = soma + vetor[i];
		}
		float media = soma / 10;
		System.out.println("A soma de todo os valores é: " + soma);
		System.out.println("A média dos valores é: " + media);
		scan.close();
	}

}
