package introducao;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite seu salário bruto:");
		float SalarioBruto = scan.nextFloat();
		System.out.println("Digite seu adicional noturno:");
		float AdicionalNoturno = scan.nextFloat();
		System.out.println("Digite suas horas extra:");
		float HorasExtras = scan.nextFloat();
		System.out.println("Digite seus descontos:");
		float Descontos = scan.nextFloat();
		
		float SalarioLiquido = SalarioBruto + AdicionalNoturno + (HorasExtras *5) - Descontos;
		
		System.out.println("Seu salário líquido é de: " + SalarioLiquido);

	}

}
