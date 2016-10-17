package recursividade;

import java.util.Scanner;

public class Fatorial {

	
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
	    
	    System.out.print("Informe um número inteiro: ");
	    int numero = Integer.parseInt(entrada.nextLine());

	    
	    System.out.print("O fatorial do número informado é: " + fatorial(numero));
	    System.out.println("\n");
	  
	    
	    
	//alternativa sem usar recursividade.	
		int fator=numero,	aux=1,	resultado=2;
		
		for (int i = 2; i <= fator; i++) {
			
			resultado =aux*i;
			aux =resultado;
			System.out.println(resultado);
			
		
		}
	}
	
	// usando recursividade
	public static long fatorial(int n){
		if (n == 0) {
			return 1;
		} else {
			return n * fatorial(n - 1);
		}
	}
}
