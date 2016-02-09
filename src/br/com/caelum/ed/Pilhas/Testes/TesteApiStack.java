package br.com.caelum.ed.Pilhas.Testes;

import java.util.Stack;

import br.com.caelum.ed.Pilhas.Peca;

/**
 * @author Daniel Dias
 *
 */
public class TesteApiStack {
	public static void main(String[] args) {
		
		Stack pilha = new Stack();
		
		Peca pecaInsere = new Peca();
		
		pilha.push(pecaInsere);
		
		Peca pecaRemove = (Peca) pilha.pop();
		
		if(pilha.isEmpty()) {
			System.out.println("A pila vazia");
		}
		
	}

}
