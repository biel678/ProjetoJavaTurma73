package lacos_repeticao;

import java.util.Scanner;

public class ExRepeticao1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int num1 = scan.nextInt();
		System.out.println("Digite o segundo número: ");
		int num2 = scan.nextInt();
		if (num1 < num2) {
			for (int contador = num1; contador < num2; contador++) {
				if ((contador % 3) == 0 && (contador % 5) == 0) {
					System.out.println(contador + " é multiplo de 3 e 5");
				}
			}
		} else {
			System.out.println("Interválo errado!");
		}
		scan.close();
	}
}