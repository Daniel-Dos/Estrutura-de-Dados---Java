package br.com.caelum.ed.Teste;

import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.Vetor;

/**
 * @author Daniel Dias
 *
 */
public class TesteRemovePorPosicao {
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		Aluno a3 = new Aluno();
		
		a1.setNome("Rafael");
		a3.setNome("Paulo");
		
		Vetor lista = new Vetor();
		
		lista.adiciona(a1);
		lista.adiciona(a3);
		
		lista.remove(0);
		
		System.out.println(lista);
	}

}
