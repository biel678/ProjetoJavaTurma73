package lacos_condicionais;

import java.util.Scanner;

public class TesteNotas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite sua primeira nota");
		float nota1 = scan.nextFloat();
		System.out.println("Digite sua segunda nota");
		float nota2 = scan.nextFloat();
		float media = (nota1 + nota2)/2;
		if(media==10) {
			System.out.println("Sua média foi perfeita!");
		}else if (media > 7 && media < 10) {
			System.out.println("Sua média foi " + media + " e você passou!");
		}else if (media <= 7 && media >= 6) {
			System.out.println("Sua média foi " + media + " e você passou na média");
		}else if (media <=5) {
			System.out.println("Você está de recuperação! Por favor continue estudando.");
		}else {
			System.out.println("Erro, por favor digite novamente");
		}

	}

}
