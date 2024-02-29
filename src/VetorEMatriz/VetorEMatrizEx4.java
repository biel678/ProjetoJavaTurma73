package VetorEMatriz;

import java.util.Scanner;

public class VetorEMatrizEx4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float matriz[][] = new float[10][4];
		float soma[] = new float[10];
		int j = 0;
		for (int i = 0; i < 10; i++) {
			for (j = 0; j < 4; j++) {
				System.out.println("Digite o valor da linha " + i + "," + j);
				matriz[i][j] = scan.nextFloat();
			}
		}
		for (int i=0;i<10;i++) {
			for(j=0;j<4;j++) {
				soma[i]= matriz[i][j] + soma[i];
			}
		}
		for (int i=0;i<10;i++) {
			soma[i] = soma[i]/4;
			System.out.printf("%.1f %n",soma[i]);
		}	
		scan.close();
	}
}