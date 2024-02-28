package lacos_condicionais;

import java.util.Scanner;

public class ExCondicionais8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o código da operação");
		System.out.println("1 - saldo");
		System.out.println("2 - saque");
		System.out.println("3 - depósito");
		float saldo = 1000f;
		int codigo = scan.nextInt();
		switch (codigo) {
		case 1:
			System.out.println("Operação escolhida: Saldo");
			System.out.println("O saldo é de: " + saldo);
			break;
		case 2:
			System.out.println("Digite o valor que deseja sacar:");
			float saque = scan.nextFloat();
			if (saque > saldo) {
				System.out.println("Sem saldo suficiente para o saque, por favor tente novamente.");
			} else {
				float ValorFinalS = saldo - saque;
				System.out.println("Operação escolhida: Saque");
				System.out.println("Saldo atual: " + ValorFinalS);
			}
			break;
		case 3:
			System.out.println("Digite o valor que deseja depositar:");
			float deposito = scan.nextFloat();
			float ValorFinalD = saldo + deposito;
			System.out.println("Operação escolhida: Depósito");
			System.out.println("Saldo atual: " + ValorFinalD);
			break;

		default:
			System.out.println("Operação invalida!");
			;
		}
		scan.close();
	}
}