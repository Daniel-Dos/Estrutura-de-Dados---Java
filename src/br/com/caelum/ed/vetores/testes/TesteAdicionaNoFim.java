package br.com.caelum.ed.vetores.testes;

import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.vetores.Vetor;
import br.com.caelum.ed.vetores.VetorGenerico;

/**
 * @author Daniel Dias
 *
 */
public class TesteAdicionaNoFim {
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		
		a1.setNome("Rafael");
		a2.setNome("Paulo");
		a3.setNome("Dnaiel");
		
	
		VetorGenerico lista = new VetorGenerico();
		
		lista.adiciona(a1);
		lista.adiciona(a2);
		lista.adiciona(a3);

		System.out.println(lista);
	}

}
