package br.com.caelum.ed.vetores;

import br.com.caelum.ed.Aluno;

/**
 * @author Daniel Dias
 *
 */
public class TesteEstoura {
	public static void main(String[] args) {
		
		VetorGenerico vetor = new VetorGenerico();
		
		for(int i = 0; i < 100001;i++) {
			Aluno aluno = new Aluno();
			vetor.adiciona(aluno);
		}
	}

}
