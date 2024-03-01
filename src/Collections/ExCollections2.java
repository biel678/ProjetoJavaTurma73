package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ExCollections2 {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o valor de posição " + i);
			num.add(scan.nextInt());
		}
		System.out.println("Digite o valor que quer procurar");
		int Proc = scan.nextInt();
		if (num.indexOf(Proc) >= 0) {
			System.out.println("O número " + Proc + " está localizado na posição: " + num.indexOf(Proc));
		} else {
			System.out.println("O número " + Proc + " não foi encontrado!");
		}
		scan.close();
	}
}