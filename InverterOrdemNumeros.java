package recursividade;

import java.util.Scanner;

public class InverterOrdemNumeros {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um numeral de ao menos 3 digitos: ");

		int valor = entrada.nextInt();
		System.out.println("Valor Digitado: " + valor);
		System.out.print("Valor Invertido: ");
		
		exibirInverso(valor);
		
	}

	public static void exibirInverso(int valor) {
		if (valor != 0) {
			System.out.print(valor % 10);
			valor = valor / 10;
			exibirInverso(valor);
		}

	}

}    
