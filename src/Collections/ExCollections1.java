package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ExCollections1 {

	public static void main(String[] args) {
		ArrayList<String> cores = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o valor de posição ");
			cores.add(scan.nextLine());
		}
		System.out.println("\nListar todas as cores:" + cores);
		cores.sort(null);
		System.out.println("\nOrdenar as cores:" + cores);
		scan.close();
	}

}
