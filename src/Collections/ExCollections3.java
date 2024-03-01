package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ExCollections3 {

	public static void main(String[] args) {
		Set<Integer> num = new HashSet<Integer>();
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o valor de posição " + i);
			num.add(scan.nextInt());
		}
		Iterator<Integer> iterator = num.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		scan.close();
	}

}
