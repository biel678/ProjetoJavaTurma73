package lacos_repeticao;

import java.util.Scanner;

public class ExRepeticao4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String verificador = "s";
		int contPessoas = 0;
		int MulheresFront = 0;
		int HomensMobile = 0;
		int Backend = 0;
		int NBFullStack = 0;
		float TotalIdade = 0;
		while (!verificador.equals("n")) {
			System.out.println("Digite sua idade");
			float idade = scan.nextInt();
			System.out.println("Digite um número equivalente a sua identidade de gênero");
			System.out.println("1- Mulher Cis");
			System.out.println("2- Homem Cis");
			System.out.println("3- Não Binário");
			System.out.println("4- Mulher Trans");
			System.out.println("5- Homem Trans");
			System.out.println("6- Outros");
			int identGen = scan.nextInt();
			System.out.println("Digite um número equivalente a sua área de desenvolvimento");
			System.out.println("1- Backend");
			System.out.println("2- Frontend");
			System.out.println("3- Mobile");
			System.out.println("4- FullStack");
			int desenv = scan.nextInt();
			if (desenv == 1) {
				Backend++;
			}
			if ((identGen == 1 || identGen == 4) && desenv == 2) {
				MulheresFront++;
			} else if ((identGen == 2 || identGen == 5) && desenv == 3 & idade > 40) {
				HomensMobile++;
			} else if (identGen == 3 && desenv == 4 & idade > 30) {
				NBFullStack++;
			}
			contPessoas++;
			System.out.println("Quer continuar? (S/N)");
			verificador = scan.next();
			TotalIdade = TotalIdade + idade;
		}
		float MediaIdade = 0;
		MediaIdade = TotalIdade / contPessoas;
		System.out.println("O total de pessoas desenvolvedoras Backend foi de: " + Backend);
		System.out.println("O total de Mulheres desenvolvedoras Frontend foi de: " + MulheresFront);
		System.out.println("O total de Homens desenvolvedores Mobile foi de: " + HomensMobile);
		System.out.println("O total de pessoas Não Bináries desenvolvedores FullStack foi de: " + NBFullStack);
		System.out.println("O número total de pessoas na pesquisa foi de: " + contPessoas);
		System.out.println("A média de idade das pessosa que fizeram a pesquisa foi de: " + MediaIdade + " anos.");
		scan.close();
	}
}