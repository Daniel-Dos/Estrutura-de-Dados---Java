package br.com.caelum.ed.vetores;

import br.com.caelum.ed.Aluno;

/**
 * @author Daniel Dias
 *
 */
public class TesteDeTempoDoContem {
	public static void main(String[] args) {
		
		VetorGenerico vetor = new VetorGenerico();
		long inicio = System.currentTimeMillis();
		
		//adicionando 100000 aluno e
		//verificando se eles foram realmene adicionados
		
		for(int i = 1; i < 30000; i++) {
			Aluno aluno = new Aluno();
			vetor.adiciona(aluno);
			if(!vetor.contem(aluno)) {
				System.out.println("Erro: aluno" + aluno + " nao foi adicoinado");
			}
		}
		
		//verificando se o vetor nao encontr alunos nao adiconados
		for(int i = 1; i < 30000; i++) {
			Aluno aluno = new Aluno();
			if(vetor.contem(aluno)) {
				System.out.println("Erro: aluno" + aluno + "foi adiconado");
			}
		}
		
		long fim = System.currentTimeMillis();
		double tempo = (fim - inicio) / 1000.0;
		System.out.println("Tempo = " + tempo);
	}

}
