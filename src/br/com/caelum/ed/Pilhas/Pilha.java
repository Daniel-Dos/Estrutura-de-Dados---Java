package br.com.caelum.ed.Pilhas;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Daniel Dias
 *
 */
public class Pilha<T> {
	
	private List<T> objetos = new LinkedList<T>();
	public void insere(T t) {
		//inserir uma peça
		this.objetos.add(t);
	}
	public T remove() {
		//remover uma peca
		return this.objetos.remove(this.objetos.size() - 1);
	}
	public boolean vazia() {
		//informar pilha esta vazia
		
		return this.objetos.size() == 0;
		}
	

	
}
