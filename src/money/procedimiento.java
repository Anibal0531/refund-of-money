package money;

public class procedimiento {
	public int root;
	
	public int getRoot() {
		return root;
	}

	public void setRoot(int root) {
		this.root = root;
	}

	public int insertdato(int valor2) {
	     int [] numero = {2 , 5 , 10};
	     int contador;
	     int valor = 13;
	  
	     
	     if(numero[0] == this.root) {
	    	    return numero[0];
	     }
	    	 else {
	    		 if(numero[0] <= valor) {
	    			 valor = valor - numero[0];
	    	    	 this.root = valor; 
	    	    	 valor=this.root;
	    	    	 contador=this.root;
	    		 }
	    	 } 
	     return insertdato(this.root);
	     }
	
}

