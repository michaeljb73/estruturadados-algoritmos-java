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
    	
    	aumentaCapacidade();
    	
        if(this.tamanho < elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            // System.out.println("O elemento \"" + elemento + "\" foi adicionado com sucesso !");
            // System.out.println(elemento);
            return true;
        }
        System.out.println("O \"" + elemento + "\" não pode ser adicionado !");
        return false;
    }
    
    // ( ADICIONA ELEMENTO EM QUALQUER POSIÇÃO )
    public boolean adiciona(int posicao, String elemento) {
        
    	aumentaCapacidade();
    	
    	if( !(posicao >= 0 && posicao < tamanho) ) {
    		throw new IllegalArgumentException("Posição inválida !");
    	}
    	
    	// Mover todos os elementos.
    	for( int i = this.tamanho - 1; i >= posicao; i--) {
    		this.elementos[i+1] = this.elementos[i];
    	}
    	this.elementos[posicao] = elemento;
    	this.tamanho++;
    	
    	return true;
    }
    
    // ( BUSCA )
    public String busca(int posicao) {
    	
    	if( !(posicao >= 0 && posicao < tamanho) ) {
    		throw new IllegalArgumentException("Posição inválida !");
    	}
    	
    	return this.elementos[posicao];
    }
    
    // ( BUSCA SOBRESCRITA - Busca Seguencial )
    public int busca(String elemento) {
    	
    	for(int i = 0; i < this.tamanho; i++) {
    		if(this.elementos[i].equals(elemento)) {
    			return i;
    		}
    	}
    	return -1;
    }    
    
    // ( GET TAMANHO )
    public int getTamanho() {
    	return this.tamanho;
    }
    
    // ( ADICIONAR CAPACIDADE DO VETOR )
    private void aumentaCapacidade() {
    	if( this.tamanho == this.elementos.length ) {
    		String[] elementosNovos = new String[ this.elementos.length * 2];
    		
    		for( int i = 0; i < this.elementos.length; i++ ) {
    			elementosNovos[i] = this.elementos[i];
    		}
    		
    		this.elementos = elementosNovos;
    		
    	}
    }
    
    // ( TO STRING )
	@Override
	public String toString() {
		
		StringBuilder stringBuilder = new StringBuilder();
		
		stringBuilder.append("[");
		
		for( int i = 0; i < this.tamanho - 1; i++) {
				stringBuilder.append(elementos[i]);
				stringBuilder.append(", ");
		}
		
		if(this.tamanho > 0) {
			stringBuilder.append(this.elementos[this.tamanho - 1]);
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
