package br.com.caelum.ed.Teste;

import java.util.ArrayList;

import br.com.caelum.ed.Aluno;

/**
 * @author Daniel Dias
 * 
 * Api do Java - ArrayList
 * 
 *  
 *
 */
public class TesteAPIJava {
	public static void main(String[] args) {
		
		ArrayList vetor = new ArrayList();
		
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
		
		vetor.add(aluno1);
		vetor.add(aluno2);
		vetor.add(0,aluno3);
		
		int tamanho = vetor.size();
		
		if(tamanho !=3) {
			System.out.println("Erro: O tamanho da lista esta errado");
		}
		
		if(!vetor.contains(aluno1)) {
			System.out.println("Erro: nao achou um aluno que deveria esta na lista");
		}
		
		vetor.remove(0);
		tamanho = vetor.size();
		
		if(tamanho !=2) {
			System.out.println("Erro: O tamanho da lista esta errado");
		}
		
		if(vetor.contains(aluno3)) {
			System.out.println("erro: Achou um aluno que nao deveria esta na lista");
		}
	}

}
