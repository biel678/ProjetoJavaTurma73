package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionArrayList {

	public static void main(String[] args) {
		ArrayList<Double> notas = new ArrayList<Double>();
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 6; i++) {
			System.out.println("Digite o valor de posição " + i);
			notas.add(scan.nextDouble());
		}
		notas.sort(null);
		System.out.println("\nNotas cadastradas: " + notas);
		System.out.println("\nA posição da nota 10 é: " + notas.indexOf(10d));
		System.out.println(notas);
		scan.close();
	}
}