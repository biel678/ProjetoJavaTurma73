package lacos_condicionais;

import java.util.Scanner;

public class ExCondicionais4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite se o animal é vertebrado ou invertebrado");
		String Vert = scan.next();
		if (Vert.equals("vertebrado")) {
			System.out.println("Digite se é ave ou mamífero");
			String TipoV = scan.next();
			if (TipoV.equals("ave")) {
				System.out.println("Digite se é carnívoro ou onívoro");
				String AlimV = scan.next();	
				if(AlimV.equals("carnívoro")) {
					System.out.println("O animal é uma Águia");
				}else if (AlimV.equals("onívoro")) {
					System.out.println("O animal é uma Pomba");
				}
			}else if (TipoV.equals("mamífero")) {
				System.out.println("Digite se é herbívoro ou onívoro");
				String AlimV = scan.next();	
				if(AlimV.equals("herbívoro")) {
					System.out.println("O animal é uma Vaca");
				}else if (AlimV.equals("onívoro")) {
					System.out.println("O animal é uma Homem");
				}
			}	
		}
		
		else if(Vert.equals("invertebrado")) {
			System.out.println("Digite se é inseto ou anelídeo");
			String TipoI = scan.next();
			if (TipoI.equals("inseto")) {
				System.out.println("Digite se é hematófago ou herbívoro");
				String AlimI = scan.next();	
				if(AlimI.equals("hematófago")) {
					System.out.println("O animal é uma Pulga");
				}else if (AlimI.equals("herbívoro")) {
					System.out.println("O animal é uma Lagarta");
				}
			}else if (TipoI.equals("anelídeo")) {
				System.out.println("Digite se é hematófago ou onívoro");
				String AlimI = scan.next();	
				if(AlimI.equals("hematófago")) {
					System.out.println("O animal é um Sanguessuga");
				}else if (AlimI.equals("onívoro")) {
					System.out.println("O animal é uma Minhoca");
				}
			}
		}
	}
}