package br.com.caelum.ed.Filas.Testes;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

import br.com.caelum.ed.Aluno;

/**
 * @author Daniel Dias
 *
 */
public class TesteApiFilaGenerica {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		Queue<Aluno> fila = new LinkedList<Aluno>();
		
		Aluno aluno  = new Aluno();
		
		fila.offer(aluno);
		
		Aluno alunoRemovido = fila.poll();
		
		if(fila.isEmpty()) {
			System.out.println("Vazia");
		}
		
		
		
	}

}
