package br.com.caelum.ed.ListaLigadas.Testes;

import br.com.caelum.ed.ListaLigadas.ListaLigada;

/**
 * @author Daniel Dias
 *
 */
public class TesteAdicionaNoFim {
	public static void main(String[] args) {
		
		ListaLigada lista = new ListaLigada();
		
		lista.adiciona("Rafel");
		lista.adiciona("Paulo");
		
		System.out.println(lista);
	}

}
