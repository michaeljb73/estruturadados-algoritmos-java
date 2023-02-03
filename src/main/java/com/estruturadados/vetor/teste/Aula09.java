package com.estruturadados.vetor.teste;

import com.estruturadados.vetor.Vetor;

public class Aula09 {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(3);
		
		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("E");
		vetor.adiciona("F");
		vetor.adiciona("G");
		
		System.out.println(vetor);
		
		String elemento = "F";
		int pos = vetor.busca(elemento);
		
		System.out.println("Removendo o elemento: " + elemento);
		
		if(pos > -1) {
			vetor.remove(pos);	
			System.out.println("Elemento \"" + elemento + "\" removido !");
		} else {
			System.out.println("Elemento \"" + elemento + "\" não existe !");
		}
		
		System.out.println(vetor);
		
		vetor.adiciona("H");
		System.out.println(vetor);

	}

}
