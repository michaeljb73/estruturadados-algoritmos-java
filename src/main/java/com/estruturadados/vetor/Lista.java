package com.estruturadados.vetor;

import java.lang.reflect.Array;

public class Lista<T> {

	private T[] elementos;
    private int tamanho;

    // ( LISTA )
    public Lista(int capacidade) {
        this.elementos = (T[])new Object[capacidade]; // Solução do livro Java Eetivo
        this.tamanho = 0;
    }
    
    // ( LISTA SOBRESCRITA )
    public Lista(Class<T> tipoClasse, int capacidade) {
        this.elementos = (T[])Array.newInstance(tipoClasse, capacidade);
        this.tamanho = 0;
    }

    // ( ADICIONA )
    public boolean adiciona(T elemento) {
    	
    	aumentaCapacidade();
    	
        if(this.tamanho < elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        System.out.println("O \"" + elemento + "\" não pode ser adicionado !");
        return false;
    }
    
    // ( ADICIONA ELEMENTO EM QUALQUER POSIÇÃO )
    public boolean adiciona(int posicao, T elemento) {
        
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
    
    // ( REMOVER )
    public void remove(int posicao) {
    	
    	if( !(posicao >= 0 && posicao < tamanho) ) {
    		throw new IllegalArgumentException("Posição inválida !");
    	}
    	
    	for(int i = posicao; i < this.tamanho - 1; i++) {
    		this.elementos[i] = this.elementos[i+1];
    	}
    	
    	this.tamanho--;
    }
    
    // ( BUSCA )
    public Object busca(int posicao) {
    	
    	// Validador de posição
    	if( !(posicao >= 0 && posicao < tamanho) ) {
    		throw new IllegalArgumentException("Posição inválida !");
    	}
    	
    	return this.elementos[posicao];
    }
    
    // ( BUSCA SOBRESCRITA - Busca Seguencial )
    public int busca(T elemento) {
    	
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
    		T[] elementosNovos = (T[]) new Object[ this.elementos.length * 2];
    		
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

}
