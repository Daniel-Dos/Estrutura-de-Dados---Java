package br.com.caelum.ed.Filas.Testes;

import java.util.LinkedList;
import java.util.Queue;

import br.com.caelum.ed.Aluno;

/**
 * @author Daniel Dias
 *
 */
public class TesteJavaApiFila {
	public static void main(String[] args) {
		
		Queue fila = new LinkedList();
		
		Aluno aluno = new Aluno();
		
		fila.offer(aluno); // para adionar 
		
		Aluno alunoRemovido = (Aluno)fila.poll(); //para remover
		
		if(fila.isEmpty()) {
			System.out.println("Vazia");
		}
	}

}
