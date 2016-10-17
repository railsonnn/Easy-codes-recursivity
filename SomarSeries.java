package recursividade;

public class SomarSeries {

	public static void main(String[] args) {
		
		
		// vamos somar a série 1 + 1/2 + 1/3 + 1/4 + 1/5
	    System.out.println("A soma da série é " + somarSerie(5));
	      
	    System.out.println("\n");
	  }
	  
	  // método recursivo que retorna a soma de uma série
	  public static double somarSerie(int i) {
	    if (i == 1){ // caso base...devemos parar a recursividade
	      return 1;
	    }
	    else{
	      return (somarSerie(i - 1) + 1.0) / i; // mais uma chamada recursiva
	    }
	  }
}
