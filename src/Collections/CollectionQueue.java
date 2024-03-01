package Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CollectionQueue {

	public static void main(String[] args) {
		Queue<Integer> fila = new LinkedList<Integer>();
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i <= 10; i++)
			fila.add(scan.nextInt());
		System.out.println("\nElementos na fila: " + fila);
		System.out.println("\nRemover Elemento: " + fila.remove());
		System.out.println("\nFila atualizada: " + fila);
		System.out.println("\nAdicionar Elemento 11: " + fila.add(11));

		System.out.println("\nExibir a Fila atualizada: " + fila);

		System.out.println("\nExibir o Primeiro Elemento da fila: " + fila.peek());

		Iterator<Integer> iterator = fila.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		scan.close();
	}

}
