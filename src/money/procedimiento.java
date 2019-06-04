package money;

public class procedimiento {
	
	public int insertdato(int valor2) {
	     int [] numero = {2 , 5 , 10};
	     int contador= 0;
	     int valor = 13;
	     
	     if(numero[0] == valor) {
	    	    return numero[0];
	     }
	    	 else {
	    		 if(numero[0] <= valor) {
	    			 valor = valor - numero[0];
	    	    	 contador = valor;
	    	    	 valor = contador;
	    		 }
	    	 } 
	     return contador;
	     }
}

