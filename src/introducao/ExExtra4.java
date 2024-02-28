package introducao;

import java.util.Scanner;

public class ExExtra4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um valor");
		 int valor = scan.nextInt();
		 int Cem = valor / 100;	
		 valor =valor% 100;
		 int Cinquenta = valor/50;	
		 valor = valor % 50;
		 int Vinte = valor/20;
		 valor = valor % 20;
		 int Dez = valor/10;
		 valor = valor % 10;
		 int Cinco = valor/5;
		 valor = valor % 5;
		 int Dois = valor / 2;
		 valor = valor% 2;
		 int Um = valor;
		 System.out.println(Cem + " nota(s) de R$100,00");
		 System.out.println(Cinquenta + " nota(s) de R$50,00");
		 System.out.println(Vinte + " nota(s) de R$20,00");
		 System.out.println(Dez + " nota(s) de R$10,00");
		 System.out.println(Cinco + " nota(s) de R$5,00");
		 System.out.println(Dois + " nota(s) de R$2,00");
		 System.out.println(Um + " nota(s) de R$1,00");
		 scan.close();
		 }
}