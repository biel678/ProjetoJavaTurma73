package Collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExCollections4 {

	public static void main(String[] args) {
		Set<Integer> num = new HashSet<Integer>();
		Scanner scan = new Scanner(System.in);
		boolean confirmacao = false;
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o valor de posição " + i);
			num.add(scan.nextInt());
		}
		System.out.println("Digite um valor para procurar: ");
		int Proc = scan.nextInt();
		for (Integer setNum : num) {
			if (setNum == Proc) {
				System.out.println("O número " + Proc + " foi encontrado! ");
				confirmacao = true;
			}
		}
		if (confirmacao == false) {
			System.out.println("O número " + Proc + " não foi encontrado");
		}
		scan.close();
	}

}
