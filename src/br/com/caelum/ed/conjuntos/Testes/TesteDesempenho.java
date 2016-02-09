package br.com.caelum.ed.conjuntos.Testes;

import br.com.caelum.ed.conjuntos.ConjuntoEspalhamento;

/**
 * @author Daniel Dias
 *
 */
public class TesteDesempenho {
	public static void main(String[] args) {
		
		long inicio  = System.currentTimeMillis();
		
		ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();
		
		for(int i = 0; i < 50000; i++) {
			conjunto.adiciona("Palavra :" + i);
		}
		
		for(int i = 0; i < 50000; i++) {
			conjunto.contem("Palavras :" + i);
		}
		
		long fim = System.currentTimeMillis();
		
		System.out.println("Tempo: " + (fim - inicio) / 1000.0);
	}

}
