package com.estruturadados.vetor.teste;

import com.estruturadados.vetor.Lista;

public class Aula11 {

	public static void main(String[] args) {
		Lista<Contato> vetor = new Lista(5);
		
		Contato c1 = new Contato("contato1", "1234-5678", "contato1@gmail.com");
		Contato c2 = new Contato("contato2", "1123-5678", "contato2@gmail.com");
		Contato c3 = new Contato("contato3", "0012-5678", "contato3@gmail.com");
		
		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);
		
		System.out.println(vetor);
		
	}

}
