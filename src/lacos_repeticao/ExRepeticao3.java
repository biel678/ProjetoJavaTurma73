package lacos_repeticao;

import java.util.Scanner;

public class ExRepeticao3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cont = 0;
		int i21 = 0;
		int i50 = 0;
		while (cont <= 10) {
			System.out.println("Digite uma idade: ");
			int num = scan.nextInt();
			if (num < 21 && num > 0) {
				i21++;
			} else if (num > 50) {
				i50++;
			}
			cont++;
			if (num < 0) {
				System.out.println("Fim da inserção de números");
				break;
			}
		}
		System.out.println("Total de pessoas menores de 21 ano: " + i21);
		System.out.println("Total de pessoas maiores de 50 ano: " + i50);
		scan.close();
	}

}
