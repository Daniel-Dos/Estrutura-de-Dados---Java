package br.com.caelum.ed.Pilhas.Testes;

import java.util.Stack;

import br.com.caelum.ed.Pilhas.Peca;

/**
 * @author Daniel Dias
 *
 */
public class TesteApiStackGenerics {
	public static void main(String[] args) {
		
		Stack<Peca> pilha = new Stack<Peca>();
		
		Peca pecaInsere = new Peca();
		pilha.push(pecaInsere);
		
		Peca pecaRemove = pilha.pop();
		
		if(pilha.isEmpty()) {
			System.out.println("Vazia");
		}
	}

}
