package recursividade;

import java.util.Scanner;

public class PesquisarReticaodeValor {
	public static void main(String[] args) {
	    // cria um novo objeto da classe Scanner
	    Scanner entrada = new Scanner(System.in);
	    
	    // vamos declarar um vetor de 10 inteiros
	    int valores[] = new int[5];
	    
	    // vamos pedir ao usuário que informe os valores do vetor
	    for(int i = 0; i < valores.length; i++){
	      System.out.print("Informe o " + (i + 1) + " valor: ");
	      // efetua a leitura do valor informado para a posição atual do vetor
	      valores[i] = Integer.parseInt(entrada.nextLine());
	    }
	    
	    // agora vamos pedir para informar o valor a ser pesquisado
	    System.out.print("\nInforme o valor a ser pesquisado no vetor: ");
	    int valor = Integer.parseInt(entrada.nextLine());
	    
	    // e vamos ver a quantidade de repetições
	    int repeticoes = quantRepeticoes(0, valor, valores);
	    System.out.print("O valor informado se repete " + repeticoes + " vezes.");
	    
	    System.out.println("\n");
	  }
	  
	  public static int quantRepeticoes(int indice, int valor, int[] vetor){
	    if(indice == vetor.length - 1){ // caso base...hora de parar a recursividade
	      if(vetor[indice] == valor){
	        return 1; // mais um repetição foi encontrada
	      }
	    }
	    else{ // dispara mais uma chamada recursiva
	      if(vetor[indice] == valor){ // houve mais uma repetição
	        return 1 + quantRepeticoes(indice + 1, valor, vetor);
	      }
	      else{
	        return 0 + quantRepeticoes(indice + 1, valor, vetor); // não repetiu
	      }
	    }
	    
	    return 0; // só para deixar o compilador satisfeito...esta linha nunca é executada
	  }
}
