package br.com.caelum.ed.ListaLigadas.Testes;

import br.com.caelum.ed.ListaLigadas.ListaLigada;

/**
 * @author Daniel Dias
 *
 */
public class TesteAdicionaPorPosicao {
	public static void main(String[] args) {
		
		ListaLigada lista = new ListaLigada();
		
		lista.adiciona("Rafael");
		lista.adiciona(0, "Paulo");
		lista.adiciona(1, "Ana");
		
		System.out.println(lista);
	}

}
