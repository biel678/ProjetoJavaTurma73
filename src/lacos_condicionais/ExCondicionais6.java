package lacos_condicionais;

import java.util.Scanner;

public class ExCondicionais6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float reajuste = 0;
		String cargo = null;
		System.out.println("Digite seu nome: ");
		String nome = scan.nextLine();
		System.out.println("Digite o código do seu cargo de 1 a 6: ");
		int codigo = scan.nextInt();
		switch(codigo) {
		case 1:
			System.out.println("Você escolheu: Gerente");
			cargo = "Gerente";
			System.out.println("Seu reajuste foi de 10%");
			reajuste = 0.10f;
			break;
		case 2:
			System.out.println("Você escolheu: Vendedor");
			cargo = "Vendedor";
			System.out.println("Seu reajuste foi de 7%");
			reajuste = 0.07f;
			break;
		case 3:
			System.out.println("Você escolheu: Supervisor");
			cargo = "Supervisor";
			System.out.println("Seu reajuste foi de 9%");
			reajuste = 0.09f;
			break;
		case 4:
			System.out.println("Você escolheu: Motorista");
			cargo = "Motorista";
			System.out.println("Seu reajuste foi de 6%");
			reajuste = 0.06f;
			break;
		case 5:
			System.out.println("Você escolheu: Estoquista");
			cargo = "Estoquista";
			System.out.println("Seu reajuste foi de 5%");
			reajuste = 0.05f;
			break;
		case 6:
			System.out.println("Você escolheu: Técnico de TI");
			cargo = "Técnico de TI";
			System.out.println("Seu reajuste foi de 8%");
			reajuste = 0.08f;
			break;
		}
		System.out.println("Digite o seu salário atual");
		float salario = scan.nextFloat();
		float SalarioFinal = salario + (salario * reajuste);
		System.out.println("Olá " + nome + " seu Cargo é: " + cargo + " e o valor final foi de: " + SalarioFinal);
	}
}