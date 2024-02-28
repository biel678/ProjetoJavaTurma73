package lacos_condicionais;

import java.util.Scanner;

public class OperadorE {

	public static void main(String[] args) {
		int idade;
		String carteiraM;
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite sua idade: ");
		idade = scan.nextInt();

		System.out.println("Você tem carteira de habilitação? (S/N)");
		carteiraM = scan.next();

		if (idade >= 18 && carteiraM.equals("S")) {
			System.out.println("Pode dirigir");
		} else if (idade < 18) {
			System.out.println("Ainda não tem idade para isso");
		} else if (idade >= 18 && carteiraM.equals("N")) {
			System.out.println("Você precisa de carteira de motorista ainda!");
		} else {
			System.out.println("Algum erro encontrado, por favor tente novamente");
		}
		scan.close();
	}
}