package lacos_condicionais;

public class NaoInterativo {

	public static void main(String[] args) {
		int idade = 2;
		if (idade >= 18) {
			System.out.println("Você é maior de idade! ");
		} else if (idade <= 2) {
			System.out.println("Gugu dada gugu, dada dada gugu dada...");
		} else {
			System.out.println("Vocé ainda é menor de idade, tente novamente mais tarde...");
		}

		int x = 10;
		int y = 10;
		if (x > y) {
			System.out.println("X é maior que Y");
		} else if (x == y) {
			System.out.println("X e Y são iguais");
		} else {
			System.out.println("Y é maior que X");
		}
	}
}