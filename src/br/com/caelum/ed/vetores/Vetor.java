package br.com.caelum.ed.vetores;

import br.com.caelum.ed.Aluno;

/**
 * @author Daniel Dias
 *
 */
public class Vetor {
	
	//Declarando e inicalizando um array de Aluno
	private Aluno[] alunos = new Aluno[100000];
	private int totalDeAlunos = 0;
	
	
	private void garanteEspaco() {
		if(this.totalDeAlunos == this.alunos.length) {
			Aluno[] novoArray = new Aluno[this.alunos.length * 2];
			for(int i = 0; i < this.alunos.length; i++) {
				novoArray[i] = this.alunos[i];
			}
			this.alunos = novoArray;
		}
	}
	public void adiciona(Aluno aluno) {
		
		this.garanteEspaco();
		this.alunos[this.totalDeAlunos] = aluno;
		this.totalDeAlunos++;
	}
	
	public void adiciona(int posicao, Aluno aluno) {
		this.garanteEspaco();
		if(!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posicao invalida");
		}
		
		for(int i  =this.totalDeAlunos -1; i >= posicao; i--) {
			this.alunos[i + 1] = this.alunos[i];
		}
		
		this.alunos[posicao] = aluno;
		this.totalDeAlunos++;
		
	}
	
	private boolean posicaoValida(int posicao) {
		return posicao >=0 && posicao <= this.totalDeAlunos;
	}
	public Aluno pega(int posicao) {
		
		if(!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posicao invalida");
		}
		return this.alunos[posicao];
	}
	
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.totalDeAlunos;
	}
	public void remove(int posicao) {
		
		if(!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posicao Invalida");
		}
		
		for(int i = posicao; i < this.totalDeAlunos -1; i++) {
			this.alunos[i] = this.alunos[i + 1];
		}
		this.totalDeAlunos--;
	}
	
	public boolean contem(Aluno aluno) {
	
		for(int i = 0; i < this.totalDeAlunos; i++) {
			if(aluno == this.alunos[i]) {
				return true;
			}
			
		}
		return false;
	}
	
	public int tamanho() {
		return this.totalDeAlunos;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		if(this.totalDeAlunos == 0) {
			return "[]";
		}
		
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		
		for(int i = 0; i < this.totalDeAlunos - 1; i++) {
			builder.append(this.alunos[i]);
			builder.append(", ");
		}
		
		builder.append(this.alunos[this.totalDeAlunos -1 ]);
		builder.append("]");
		
		return builder.toString();
	}
	

}
