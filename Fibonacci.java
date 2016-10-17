package recursividade;

import java.util.Scanner;

/*
Série:  0  1  1  2  3  5  8  13  21  34  55  89 
Índice: 0  1  2  3  4  5  6   7   8   9  10  11 
Cada número da série é a soma dos dois números anteriores. 
A linha de baixo reflete o índice do número. Assim, 
quando falamos "O quinto número de Fibonacci", nós estamos nos referindo ao índice 4, ou seja, o valor 3.

Este algorítmos consiste em, dado um determinado índice, 
retornar o número de Fibonacci correspondente. 
Recursivamente, o cálculo pode ser feito da seguinte forma: 

fib(0) = 0;
fib(1) = 1;
fib(indice) = fib(indice - 2) + fib(indice - 1); sendo o indice >= 2
*/

public class Fibonacci {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe o índice: ");
		int indice = Integer.parseInt(entrada.nextLine());

		System.out.print("O número de Fibonacci no índice informado é: " + fibonacci(indice));
		System.out.println("\n");
	}

	public static int fibonacci(int indice) {
		if (indice == 0) { // caso base; interrompe a recursividade
			return 0;
		} else if (indice == 1) { // caso base; interrompe a recursividade
			return 1;
		} else { // efetua uma nova chamada recursiva
			return fibonacci(indice - 1) + fibonacci(indice - 2);
		}

	}

}
