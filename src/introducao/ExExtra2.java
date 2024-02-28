package introducao;

import java.util.Scanner;

public class ExExtra2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float pi = 3.14159f;
		System.out.println("Digite o raio: ");
		float raio = scan.nextFloat();
		float area = pi * (raio * raio);
		System.out.printf("A área é de: %.4f %n" , area);
		scan.close();
		}
}