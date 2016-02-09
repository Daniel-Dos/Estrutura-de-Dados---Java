package br.com.caelum.ed.Filas;

import java.util.LinkedList;
import java.util.List;

import br.com.caelum.ed.Aluno;

/**
 * @author Daniel Dias
 *
 * Object = generalizando
 */
public class Fila<T> {
	
	private List<T> objetos = new LinkedList<T>();
	
	public void insere(T t) {
		this.objetos.add(t);
	}
	public T remove() {
		return this.objetos.remove(0);
	}
	public boolean vazia() {
		return this.objetos.size() == 0;
	}

}
