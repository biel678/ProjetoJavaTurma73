package lacos_condicionais;

import java.util.Scanner;

public class ExCondicionais7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o número 1:");
		float num1 = scan.nextFloat();
		System.out.println("Digite o número 2:");
		float num2 = scan.nextFloat();
		System.out.println("Digite o código:");
		int codigo = scan.nextInt();
		float operacao = 0;
		String ops = null;
		switch(codigo) {
		case 1:
			ops = " + ";
			operacao = num1 + num2;
			System.out.println(num1 + ops + num2 + " = " + operacao);
			break;
		case 2:
			ops = " - ";
			operacao = num1 - num2;
			System.out.println(num1 + ops + num2 + " = " + operacao);
			break;
		case 3:
			ops = " * ";
			operacao = num1 * num2;
			System.out.println(num1 + ops + num2 + " = " + operacao);
			break;
		case 4:
			ops = " / ";
			operacao = num1 / num2;
			System.out.println(num1 + ops + num2 + " = " + operacao);
			break;
		default: System.out.println("Operação invalida!");;
		}
	}
}