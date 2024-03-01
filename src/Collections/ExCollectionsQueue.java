package Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExCollectionsQueue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
		String verificador = "s";
		while (!verificador.equals("n")) {
			System.out.println("\n******************************************************************");
			System.out.println("Bem vindo! Por favor escolha um dos itens abaixo para prosseguir:");
			System.out.println("\n 1- Adicionar Cliente na Fila");
			System.out.println("\n 2- Listar todos os Clientes na fila");
			System.out.println("\n 3- Chamar uma pessoa da fila");
			System.out.println("\n 0- Sair");
			System.out.println("******************************************************************");
			int opcao = scan.nextInt();
			System.out.println("");
			if (opcao == 1) {
				System.out.println("Digite um nome para entrar na fila:");
				fila.add(scan.next());
				System.out.println("\nCliente Adicionado!");
				System.out.println("");
			} else if (opcao == 2) {
				System.out.println("Lista de Clientes na Fila:");
				System.out.println("");
				Iterator<String> iterator = fila.iterator();
				while (iterator.hasNext()) {
					System.out.println(iterator.next());
					System.out.println("");
				}
			} else if (opcao == 3) {
				if (fila.isEmpty() == true) {
					System.out.println("A fila está vazia!");
				} else {
					System.out.println("\nCliente chamado: " + fila.remove());
					System.out.println("\nFila atualizada: " + fila);
					System.out.println("\nO cliente foi chamado!");
					System.out.println("");
				}
			} else if (opcao == 0) {
				verificador = "n";
			}
		}
		System.out.println("Programa Finalizado!");
		System.out.println("Obrigado, volte sempre!");
		scan.close();
	}

}
