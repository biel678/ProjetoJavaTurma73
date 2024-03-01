package Collections;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class ExCollectionsStack {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack<String> pilha = new Stack<String>();
		String verificador = "s";
		
		while (!verificador.equals("n")) {
			System.out.println("\n******************************************************************");
			System.out.println("Bem vindo! Por favor escolha um dos itens abaixo para prosseguir:");
			System.out.println("\n 1- Adicionar Livro na pilha");
			System.out.println("\n 2- Listar todos os Livros da pilha");
			System.out.println("\n 3- Retirar Livro da pilha");
			System.out.println("\n 0- Sair");
			System.out.println("******************************************************************");
			int opcao = scan.nextInt();
			System.out.println("");
			if (opcao == 1) {
				System.out.println("Digite o nome do livro para colocar na pilha:");
				pilha.push(scan.next());
				System.out.println("\nLivro Adicionado!");
				System.out.println("");
			} else if (opcao == 2) {
				System.out.println("Lista de Livros na pilha:");
				System.out.println("");
				Iterator<String> iterator = pilha.iterator();
				while (iterator.hasNext()) {
					System.out.println(iterator.next());
					System.out.println("");
				}
			} else if (opcao == 3) {
				if (pilha.isEmpty() == true) {
					System.out.println("A pilha está vazia");
				} else {
					System.out.println("\nLivro retirado: " + pilha.pop());
					System.out.println("\nPilha atualizada: " + pilha);
					System.out.println("\nO livro foi retirado!");
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
