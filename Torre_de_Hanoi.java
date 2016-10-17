package recursividade;

import java.util.Scanner;

public class Torre_de_Hanoi {
	/*
	 * Torre de Hanói é um "quebra-cabeça" que consiste em 
	 * uma base contendo três pinos, em um dos quais 
	 * são dispostos alguns discos uns sobre os outros, 
	 * em ordem crescente de diâmetro, de cima para baixo. 
	 * O problema consiste em passar todos os discos de 
	 * um pino para outro qualquer, usando um dos pinos 
	 * como auxiliar, de maneira que um disco maior nunca 
	 * fique em cima de outro menor em nenhuma situação. 
	 * O número de discos pode variar sendo que o mais simples contém apenas três.

A solução da Torre de Hanói (The Towers of Hanoi) pode ser feita recursivamente da seguinte forma:

O caso base (parada da recursão) é quando n = 1. Se n = 1 
nós podemos simplesmente mover o disco de A para B, 
sem precisar passar pelo pino C. Quando n > 1 nós podemos dividir o problema 
original em três sub-problemas e resolvê-los sequencialmente.

1) Mova os primeiros n - 1 discos de A para C com a ajuda do pino B;
2) Mova o disco n de A para B;
3) Mova n - 1 discos do pino C para o pino B com a ajuda do pino A.

	 */

	static int quantChamadasRecursivas = 0; // registra as chamadas recursivas  
    
	  public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	      
	    // vamos ler a quantidade de discos a serem usados na simulação
	    System.out.print("Informe a quantidade de discos: ");
	    int discos = Integer.parseInt(entrada.nextLine());

	    // resolve o problema recusivamente
	    System.out.println("\nOs movimentos para resolver o problema foram:\n");
	    moverDiscos(discos, 'A', 'B', 'C');
	    System.out.println("\nForam feitas " + quantChamadasRecursivas + " chamadas recursivas");
	    System.out.println();
	  }
	  
	  // método recursivo que resolve o problema da Torre de Hanói
	  public static void moverDiscos(int n, char daTorre, char paraTorre, char torreAux) {
	    quantChamadasRecursivas++; // registra mais uma chamada recursiva
	      
	    if(n == 1){ // condição de parada
	      System.out.println("Movendo o disco " + n + " de " + daTorre + " para " + paraTorre);
	    }
	    else{ // faz mais uma chamada recursiva
	      moverDiscos(n - 1, daTorre, torreAux, paraTorre);
	      System.out.println("Movendo o disco " + n + " de " + daTorre + " para " + paraTorre);
	      moverDiscos(n - 1, torreAux, paraTorre, daTorre);
	    }
	  }
	
}
