package recursividade;

import java.util.Scanner;

public class ContarMaiusculas {
	
	public static Scanner entrada  = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		System.out.println("Digite uma frase: ");
		
		String frase= entrada.nextLine();
		
		int qtdMaiusculas= contarMaiusculas(frase);
		
		System.out.println("Quantidade de Letras Maiusculas é: "+qtdMaiusculas);
		
		
	}
	
	public static int contarMaiusculas(String frase){
		int quantidade = 0;
		
		if (frase.length() > 0) {
			if (Character.isUpperCase(frase.charAt(0))) {
				quantidade = 1 + contarMaiusculas(frase.substring(1));
				
			} else {
				quantidade = contarMaiusculas(frase.substring(1));
			}
		}
	return quantidade;
	}

}
