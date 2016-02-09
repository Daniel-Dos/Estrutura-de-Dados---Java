package br.com.caelum.ed.Teste;

import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.Vetor;

/**
 * @author Daniel Dias
 *
 */
public class TesteAdicionaNoFim {
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		Aluno a4 = new Aluno();
		Aluno a5 = new Aluno();
		Aluno a6 = new Aluno();
		Aluno a7 = new Aluno();
		Aluno a8 = new Aluno();
		
		a1.setNome("João");
		a2.setNome("José");
		a3.setNome("Java");
		a4.setNome("Daniel");
		a5.setNome("Pos");
		a6.setNome("Omega");
		a7.setNome("ware");
		a8.setNome("Mulanba");
		
		Vetor lista = new Vetor();
		
		
		lista.adiciona(a1);
		lista.adiciona(a2);
		lista.adiciona(a3);
		lista.adiciona(a4);
		lista.adiciona(a5);
		lista.adiciona(a6);
		lista.adiciona(a7);
		lista.adiciona(a8);
		
		
		
		System.out.println(lista);
	}

}
