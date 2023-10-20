import java.util.Scanner; 

public class Codigo5 {
	public static void main (String[]args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Introduzca un número: ");
	    int numero = scanner.nextInt();

	    int afortunado = 0;
	    int noAfortunado = 0;
	    
	    while (numero > 0) { int digito = numero % 10; 
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			afortunado++;
	      } else {
			noAfortunado++;
	      }
		  numero /= 10;
	    }
	    if (afortunado > noAfortunado) {
			


	    scanner.close();
	    
	  }
	  
	}
