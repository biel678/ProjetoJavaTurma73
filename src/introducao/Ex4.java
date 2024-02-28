package introducao;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor N1:");
		float N1 = scan.nextFloat();
		System.out.println("Digite o valor N2:");
		float N2 = scan.nextFloat();
		System.out.println("Digite o valor N3:");
		float N3 = scan.nextFloat();
		System.out.println("Digite o valor N4:");
		float N4 = scan.nextFloat();
		float Calculo = (N1 * N2) - (N3 * N4);
		System.out.println("A diferença é de: " + Calculo);
		scan.close();
	}
}