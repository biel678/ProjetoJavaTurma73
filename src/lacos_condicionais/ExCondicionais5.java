package lacos_condicionais;

import java.util.Scanner;

public class ExCondicionais5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float preco = 0;
		String produto = null;
		System.out.println("Digite uma opção do cardápio de 1 a 6: ");
		int opcao = scan.nextInt();
		switch(opcao) {
		case 1:
			System.out.println("Você escolheu: Cachorro quente");
			produto = "Cachorro quente";
			preco = 10;
			break;
		case 2:
			System.out.println("Você escolheu: X-Salada");
			produto = "X-Salada";
			preco = 15;
			break;
		case 3:
			System.out.println("Você escolheu: X-Bacon");
			produto = "X-Bacon";
			preco = 18;
			break;
		case 4:
			System.out.println("Você escolheu: Bauru");
			produto = "Bauru";
			preco = 12;
			break;
		case 5:
			System.out.println("Você escolheu: Refrigerante");
			produto = "Refrigerante";
			preco = 8;
			break;
		case 6:
			System.out.println("Você escolheu: Suco de laranja");
			produto = "Suco de laranja";
			preco = 13;
			break;
		}
		System.out.println("Digite a quantidade que você quer");
		int quantidade = scan.nextInt();
		float ValorTotal = quantidade * preco;
		System.out.println("Seu produto escolhido foi: " + produto + " e o valor final foi de: " + ValorTotal);
	}
}