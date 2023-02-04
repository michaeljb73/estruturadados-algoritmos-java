package com.estruturadados.vetor.teste;

import com.estruturadados.vetor.VetorObjetos;

public class Aula10 {

	public static void main(String[] args) {
		VetorObjetos vetor = new VetorObjetos(3);
		
		/**
		 * Obs.:
		 * Autoboxing: Processo de passar um tipo primitivo
		 * para ser transformado em um objeto.
		 * */
//		vetor.adiciona("3");
//		vetor.adiciona(4);
//		vetor.adiciona(5);
		
		/* Utilizando a classe Contato */
		
		Contato c1 = new Contato("contato1", "1234-5678", "contato1@gmail.com");
		Contato c2 = new Contato("contato2", "1123-5678", "contato2@gmail.com");
		Contato c3 = new Contato("contato3", "0012-5678", "contato3@gmail.com");
		
		Contato c4 = new Contato("contato1", "1234-5678", "contato1@gmail.com");

		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);
		
		System.out.println("Tamanho do vetor: " + vetor.getTamanho());
		System.out.println(vetor);
		
		int pos = vetor.busca(c4);
		
		if(pos > -1) {
			System.out.println("Elemento existe no vetor !");
		} else {
			System.out.println("Elemento não eiste no vetor !");
		}
		
	}

}
