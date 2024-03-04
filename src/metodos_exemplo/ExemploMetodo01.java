package metodos_exemplo;
import metodosSemRetorno.ExemploMetodo2;
public class ExemploMetodo01 {

	public static void main(String[] args) {

		int resultado = somar(2, 5);
		System.out.println("Primeiro resultado é: " + resultado);
		System.out.println("O segundo resultado é: " + somar(8, 3));
		ExemploMetodo2.mensagem();
		ExemploMetodo2.saudacao("Teste teste");
		ExemploMetodo2.cadastrar();
	}

	public static int somar(int num1, int num2) {
		return num1 + num2;
	}

}
