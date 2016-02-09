package br.com.caelum.ed.ListaLigadas.Testes;

import br.com.caelum.ed.ListaLigadas.ListaLigada;

/**
 * @author Daniel Dias
 *
 */
public class TesteRemovePorPosicao {
	public static void main(String[] args) {
		
		ListaLigada lista = new ListaLigada();
		
		lista.adiciona("Rafael");
		lista.adiciona("Paulo");
		lista.adiciona("Camila");
		
		lista.remove(1);
		
		System.out.println(lista);
	}

}
