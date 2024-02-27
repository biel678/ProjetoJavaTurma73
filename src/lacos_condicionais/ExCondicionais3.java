package lacos_condicionais;

import java.util.Scanner;

public class ExCondicionais3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = scan.next();
		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();
		System.out.println("É sua primeira doação? (true/false)");
		boolean doacao = scan.nextBoolean();
		
		if(idade>=60 && idade<=69 && doacao == false) {
			System.out.println(nome + " está apto para doar sangue!");
		}else if(idade>=60 && idade<=69 && doacao == true) {
			System.out.println(nome + " não está apto para doar sangue!");
		}else if(idade<18 || idade>69) {
			System.out.println(nome + " não está apto para doar sangue!");
		}else if(idade>=18 && idade<60) {
			System.out.println(nome + " está apto para doar sangue!");
		}
	}

}
