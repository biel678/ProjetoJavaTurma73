package introducao;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o salário: ");
		float salario = scan.nextFloat();
		System.out.println("Digite o abono: ");
		float abono = scan.nextFloat();
		float NovoSalario = salario + abono;
		System.out.println("Seu novo salário é de: " + NovoSalario);
		
	}

}
