package com.estruturadados.vetor;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    // ( VETOR )
    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    // ( ADICIONA )
    public boolean adiciona(String elemento) {
        if(this.tamanho < elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            System.out.println("O elemento \"" + elemento + "\" foi adicionado com sucesso !");
            return true;
        }
        System.out.println("O \"" + elemento + "\" não pode ser adicionado !");
        return false;
    }
    
    // ( GET TAMANHO )
    public int getTamanho() {
    	return this.tamanho;
    }
    
    // ( TO STRING )
	@Override
	public String toString() {
		
		StringBuilder stringBuilder = new StringBuilder();
		
		stringBuilder.append("[");
		
		for( String elemento: elementos ) {
			if(elemento != null) {
				stringBuilder.append(elemento);
			}
		}
		
		stringBuilder.append("]");
		
		return stringBuilder.toString() ;
	}
	
	
	
	
	/*     public void adiciona(String elemento) {
	    for(int i = 0; i < elementos.length ; i++) {
	        if(this.elementos[i] == null) {
	            this.elementos[i] = elemento;
	            break;
	        }
	    }
	} */ // Primeiro método - ineficiente
	
	/* public void adiciona(String elemento) throws Exception {
	    if(this.tamanho < elementos.length) {
	        this.elementos[this.tamanho] = elemento;
	        this.tamanho++;
	    } else {
	        throw new Exception("Vetor já está cheio, não é possível adicionar mais elementos !");
	    }
	} */ // Segundo método
    
}
