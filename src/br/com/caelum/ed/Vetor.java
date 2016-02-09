package br.com.caelum.ed;

/**
 * @author Daniel Dias
 *
 */
public class Vetor {
	
	//Declarando e Inicializando um array de Aluno com capacidade 100
	private Object[] objetos = new Object[100];  //generalização para armazenar qualque objeto
	
	private int totalDeObjetos = 0; // para guardar a quantidade de alunos;
	
	public void adiciona(Object objeto) {
		//AdicionaNoFim 
		
		/*
		for(int i = 0; i < this.alunos.length; i++) {
			if(this.alunos[i] == null) {
				this.alunos[i] = aluno;
				break;
			}
		}*/
		this.garantaEspaco(); // verifica se tem espaço
		this.objetos[this.totalDeObjetos] = objeto;
		this.totalDeObjetos++;
	}
	
	public void adiciona(int posicao, Aluno aluno) {
	     this.garantaEspaco();	
		if(!this.posisaoValida(posicao)) {
			throw new IllegalArgumentException("Posicao invalida");
		}
		
		for(int i = this.totalDeObjetos -1; i >= posicao; i-=1) {
			this.objetos[i + 1] = this.objetos[i];
		}
		
		this.objetos[posicao] = aluno;
		this.totalDeObjetos++;
	}
	
	public Object pega(int pasicao) {
		
		if(!this.posicaoOcupada(pasicao)) {
			throw new IllegalArgumentException("Posição Inválida");
		}
		return this.objetos[pasicao];
	}
	
	
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.totalDeObjetos;
	}
	
	private boolean posisaoValida(int posicao) {
		return posicao >=0 && posicao <=this.totalDeObjetos;
	}
	
	//para alcação dinamica - 
	private void garantaEspaco() {
		if(this.totalDeObjetos == this.objetos.length) {
			
			Object[] novaArray = new Object[this.objetos.length * 2]; // dobla o valor de armazenamnto do array 
			for(int i = 0; i < this.objetos.length; i++ ) {
				novaArray[i] = this.objetos[i];
			}
			this.objetos = novaArray;
		}
	}
	public void remove(int posicao) {
		//implementacao
		if(!this.posicaOcupada(posicao)) {
			throw new IllegalArgumentException("Posicao invalida");
		}
		
		for(int i = posicao; i < this.totalDeObjetos -1; i++) {
			this.objetos[i] = this.objetos[i + 1];
		}
		this.totalDeObjetos++;
	}
	
	private boolean posicaOcupada(int posica) {
		return posica < this.objetos.length && posica >=0;
	}
	
	public boolean contem(Aluno aluno) {
		//ContemAluno
		for(int i = 0; i < this.totalDeObjetos; i++) {
			if(aluno.equals(this.objetos[i])) {
				return true;
			}
		}
		return false;
	}
	
	public int tamanho() {
		//TamanhoLista
		return this.totalDeObjetos;
	}
	
	public String toString() {
		
		if(this.totalDeObjetos == 0) {
			return "[]";
		}
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		
		for(int i = 0; i < this.totalDeObjetos - 1; i++) {
			builder.append(this.objetos[i]);
			builder.append(", ");
		}
		
		builder.append(this.objetos[this.totalDeObjetos - 1]);
		builder.append("]");
		
		return builder.toString();
		
	}

}
