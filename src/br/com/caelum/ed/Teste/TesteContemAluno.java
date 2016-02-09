package br.com.caelum.ed.Teste;

import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.Vetor;

/**
 * @author Daniel Dias
 *
 */
public class TesteContemAluno {
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		
		a1.setNome("Refael");
		a2.setNome("Paulo");
		
		Vetor lista = new Vetor();
		
		lista.adiciona(a1);
		lista.adiciona(a2);
		
		Aluno aluno = new Aluno();
		aluno.setNome("Ana");
		
		System.out.println(lista.contem(aluno));
		System.out.println(lista.contem(a1) + " " + lista.contem(a2));
		
	}

}
