package lacos_condicionais;

import java.util.Scanner;

public class ExCondicionais1 {

	public static void main(String[] args) {
		float a, b , c, soma;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor A");
		a = scan.nextFloat();
		System.out.println("Digite o valor B");
		b = scan.nextFloat();
		System.out.println("Digite o valor C");
		c = scan.nextFloat();
		soma = a + b;
		if (soma > c) {
			System.out.println("A soma de A + B é Maior do que C");
		}
		if (soma < c) {
			System.out.println("A soma de A + B é Menor do que C");
		}
		if (soma == c) {
			System.out.println("A soma de A + B é Igual do que C");
		}
	}

}
