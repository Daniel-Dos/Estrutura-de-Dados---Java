package br.com.caelum.ed.Teste;

import java.util.ArrayList;

import br.com.caelum.ed.Aluno;

/**
 * @author Daniel Dias
 *
 */
public class TesteAPIJavaGenerics {
	public static void main(String[] args) {
		
		ArrayList vetorSemgenerics  = new ArrayList();
		ArrayList<Aluno> vetorComGenerics = new ArrayList<Aluno>();
		
		Aluno aluno = new Aluno();
		
		vetorSemgenerics.add(aluno);
		vetorComGenerics.add(aluno);
		
		Aluno a1 = (Aluno) vetorSemgenerics.get(0);
		Aluno a2 = vetorComGenerics.get(0);
		
		
	}

}
