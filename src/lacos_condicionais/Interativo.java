package lacos_condicionais;

import java.util.Scanner;

public class Interativo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a sua idade: ");
		int idade = scan.nextInt();
		if (idade >= 18) {
			System.out.println("Você é maior de idade! ");
		} else if (idade <= 2) {
			System.out.println("Gugu dada gugu, dada dada gugu dada...");
		} else {
			System.out.println("Vocé ainda é menor de idade, tente novamente mais tarde...");
		}
		scan.close();
	}
}
