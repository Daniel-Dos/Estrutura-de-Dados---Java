package br.com.caelum.ed.Pilhas.Testes;

import br.com.caelum.ed.Pilhas.Peca;
import br.com.caelum.ed.Pilhas.Pilha;

/**
 * @author Daniel Dias
 *
 */
public class TestePilha {
	public static void main(String[] args) {
		
		Pilha<Peca> pilha = new Pilha<Peca>();
		
		Peca peca = new Peca();
		pilha.insere(peca);
		
		Peca pecaRemove = pilha.remove();
		
		if(peca !=pecaRemove) {
			System.out.println("Erro: peca removida nao é igual a que foi inserida");
		}
		
		if(pilha.vazia()) {
			System.out.println("A pilha esta vazia");
		}
		
		Pilha<String> pilha2 = new Pilha<String>();
		pilha2.insere("Adalberto");
		pilha2.insere("Maria");
		
		String maria = pilha2.remove();
		String adalberto = pilha2.remove();
		
		System.out.println(maria);
		System.out.println(adalberto);
	}

}
