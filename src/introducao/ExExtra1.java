package introducao;

import java.util.Scanner;

public class ExExtra1 {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Digite o primeiro número");
	float A = scan.nextFloat();
	System.out.println("Digite o segundo número");
	float B = scan.nextFloat();
	
	float Soma = A + B;
	System.out.println("A soma de " + A + " e " +  B + " é " + Soma);
	float Dif = A - B;
	System.out.println("A diferença de " + A + " e " +  B + " é " + Dif);
	float Mult = A * B;
	System.out.println("A multiplicação de " + A + " e " +  B + " é " + Mult);
	float Div = A / B;
	System.out.printf("A divisão de " + A + " e " +  B + " é %.3f" , Div);
	scan.close();
}
}