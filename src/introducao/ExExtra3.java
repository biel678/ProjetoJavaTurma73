package introducao;

import java.util.Scanner;

public class ExExtra3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int hora, segundo, minuto;
		System.out.println("Digite um número");
		 segundo = scan.nextInt();
		 hora = segundo / 3600;	
		 segundo =segundo% 3600;
		 minuto = (segundo/60);	
		 segundo = segundo% 60;
		 
		
		System.out.println(hora + ":" + minuto + ":" + segundo);
	}

}
