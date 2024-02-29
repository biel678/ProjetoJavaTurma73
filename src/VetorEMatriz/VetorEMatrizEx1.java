package VetorEMatriz;

import java.util.Scanner;

public class VetorEMatrizEx1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int vetor[] = new int[10];
		boolean confirmacao = false;
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o valor do vetor " + i);
			vetor[i] = scan.nextInt();
		}
		System.out.println("Digite o valor que quer procurar: ");
		int num = scan.nextInt();
		for (int i = 0; i < 10; i++) {
			if (vetor[i] == num) {
				System.out.println("O valor " + num + " está na posição " + i);
				confirmacao = true;
			}
		}
		if (confirmacao == false) {
			System.out.println("O valor digitado não foi encontrado!");
		}
		scan.close();
	}

}
