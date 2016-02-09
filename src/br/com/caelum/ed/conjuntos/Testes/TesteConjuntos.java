package br.com.caelum.ed.conjuntos.Testes;

import java.util.List;

import br.com.caelum.ed.conjuntos.ConjuntoEspalhamento;

/**
 * @author Daniel Dias
 *
 */
public class TesteConjuntos {
	public static void main(String[] args) {
		
		ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();
		
		conjunto.adiciona("Rafael");
		conjunto.adiciona("Ana");
		conjunto.adiciona("Paulo");
		
		
		//foreach antigo
		
		List<String> palavras = conjunto.pegaTodo();
		
		/*
		for(String palavra : palavras) {
			System.out.println(palavra);
		}*/
		
		//foreach java8 com lambda
		//palavras.forEach(palavra->System.out.println(palavra));
		
		System.out.println("Antes de remover");
		System.out.println();
		//utiliznado medodo de referencia 
		palavras.forEach(System.out::println);
		
		//removendo
		
		conjunto.remove("Rafael");
		
		palavras = conjunto.pegaTodo();
		
		System.out.println("depois de remover");
		System.out.println();
		
		palavras.forEach(System.out::println);
		
		System.out.println();
		
		if(!conjunto.contem("apostila")) {
			System.out.println("Erro: nao tem a palavra : apostila");
		}
	
		conjunto.remove("apostila");
		
		if(!conjunto.contem("apostila")) {
			System.out.println("Erro: tem a palavra : apostila");
		}
		
		if(conjunto.tamanho() !=5) {
			System.out.println("Erro: o tamanho do conjunto deveria ser 5");
		}
		
		//teste de codigo de espalha
		
		for(int i = 0; i < 100; i++) {
			conjunto.adiciona("" + i);
		}
		conjunto.imprimeTabela();
		
	}

}
