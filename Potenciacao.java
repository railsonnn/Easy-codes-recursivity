package recursividade;

import java.util.Scanner;

public class Potenciacao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a Base: ");
		int base = entrada.nextInt();

		System.out.println("Digite o expoente: ");
		int expoente = entrada.nextInt();
		
		
		System.out.println("Resultado da potenciação é: "+potencia(base, expoente));
		
	}

	public static int potencia(int base, int expoente) {

		if (expoente == 1) {
			return base;
		} else {
			return base * potencia(base, expoente - 1);
		}

	}
}
