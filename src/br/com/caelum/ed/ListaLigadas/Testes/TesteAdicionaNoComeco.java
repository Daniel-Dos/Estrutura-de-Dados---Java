package br.com.caelum.ed.ListaLigadas.Testes;

import br.com.caelum.ed.ListaLigadas.ListaLigada;

/**
 * @author Daniel Dias
 *
 */
public class TesteAdicionaNoComeco {
	public static void main(String[] args) {
		
		ListaLigada lista = new ListaLigada();
		
		lista.adicionaNoComeco("Rafel");
		lista.adicionaNoComeco("Paulo");
		
		System.out.println(lista);
	}

}
