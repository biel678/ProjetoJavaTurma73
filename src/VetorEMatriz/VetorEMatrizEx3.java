package VetorEMatriz;

import java.util.Scanner;

public class VetorEMatrizEx3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int matriz[][] = new int[3][3];
		int soma1 = 0;
		int soma2 = 0;
		int j = 0;
		for (int i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.println("Digite o valor da linha " + i + "," + j);
				matriz[i][j] = scan.nextInt();
			}
		}
		System.out.println("Elementos da diagonal principal: ");
		for (int i = 0; i < 3; i++) {
			System.out.println(matriz[i][i]);
			soma1 = soma1 + matriz[i][i];
		}
		System.out.println("Elementos da diagonal secundária: ");
		j = 2;
		for (int i = 0; i < 3; i++) {
			System.out.println(matriz[i][j]);
			soma2 = soma2 + matriz[i][j];
			j--;
		}
		System.out.println("Soma dos elementos da diagonal principal: ");
		System.out.println(soma1);
		System.out.println("Soma dos elementos da diagonal secundária: ");
		System.out.println(soma2);
		scan.close();
	}
}