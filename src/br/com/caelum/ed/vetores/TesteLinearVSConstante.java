package br.com.caelum.ed.vetores;

import br.com.caelum.ed.Aluno;

/**
 * @author Daniel Dias
 *
 */
public class TesteLinearVSConstante {
	public static void main(String[] args) {
		
		VetorGenerico vetor =  new VetorGenerico();
		
		long inicio = System.currentTimeMillis();
		
		for(int i = 1; i < 100000; i++) {
			Aluno aluno = new Aluno();
			vetor.adiciona(aluno);
		}
		
		long fim = System.currentTimeMillis();
		double tempo = (fim - inicio) / 1000.0;
	System.out.println("Tempo em Segundo :" + tempo);
		
		
	}

}
