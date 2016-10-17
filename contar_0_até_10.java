package recursividade;

public class contar_0_até_10 {
	
	public static void main(String[] args) {
		
		int valor= 0;
		
		contarRecursivamente(valor);
		
System.out.println();
		
		contarRecursivoInverso(10);
		
	}

	public static int contarRecursivamente(int n){
		System.out.print(n+", ");
		if (n < 10) {
			n++;
			contarRecursivamente(n);
		} 
		return n;
	}
	public static void contarRecursivoInverso(int n){
		System.out.print(n+", ");
		if (n > 0) {
			n--;
			contarRecursivoInverso(n);
		}
	}
}
