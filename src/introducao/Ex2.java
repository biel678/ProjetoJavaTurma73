package introducao;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite sua nota N1:");
		float N1 = scan.nextFloat();
		System.out.println("Digite sua nota N2:");
		float N2 = scan.nextFloat();
		System.out.println("Digite sua nota N3:");
		float N3 = scan.nextFloat();
		System.out.println("Digite sua nota N4:");
		float N4 = scan.nextFloat();
		
		float media = (N1 + N2 + N3 + N4)/4;
		
		System.out.println("sua média final é " + media);
	}

}
