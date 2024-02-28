package lacos_condicionais;

import java.util.Scanner;

public class ExCondicionais2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número");
		int X = scan.nextInt();
		if ((X % 2) == 0 && X > 0) {
			System.out.println("O número é par e positivo!");
		} else if ((X % 2) == 1 && X > 0) {
			System.out.println("O número é ímpar e positivo!");
		} else if ((X % -2) == 0 && X < 0) {
			System.out.println("O número é par e negativo!");
		} else if ((X % 2) == -1 && X < 0) {
			System.out.println("O número é ímpar e negativo!");
		}
		scan.close();
	}
}
