package recursividade;

import java.util.Scanner;

public class MDC_máximo_divisor_comum {
	public static void main(String[] args) {
	
		
		Scanner entrada = new Scanner(System.in);
		
		   System.out.print("Informe o primeiro inteiro: ");
		   
		    int num1 = Integer.parseInt(entrada.nextLine());
		
		    System.out.print("Informe o segundo inteiro: ");

		    int num2 = Integer.parseInt(entrada.nextLine());
		
		System.out.print("O MDC dos valores " + num1 + " e " +
			      num2 + " é " + mdc(num1, num2));
			    System.out.println("\n");
		
	}
	public static int mdc(int n1, int n2){
		if (n2 == 0) {
			return n1;
		} else {
			return 	mdc(n2, n1%n2);
		}
	}

}
