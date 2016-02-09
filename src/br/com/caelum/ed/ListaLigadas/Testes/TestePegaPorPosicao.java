package br.com.caelum.ed.ListaLigadas.Testes;

import br.com.caelum.ed.ListaLigadas.ListaLigada;

/**
 * @author Daniel Dias
 *
 */
public class TestePegaPorPosicao {
	public static void main(String[] args) {
		
		ListaLigada lista = new ListaLigada();
		
		lista.adiciona("Rafael");
		lista.adiciona("Paulo");
		
		System.out.println(lista.pega(0));
		System.out.println(lista.pega(1));
		
		
	}

}
