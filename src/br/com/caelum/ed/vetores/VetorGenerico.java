package br.com.caelum.ed.vetores;

import br.com.caelum.ed.Aluno;

/**
 * @author Daniel Dias
 *
 */
public class VetorGenerico {
	
	//Declarando e inicalizando um array de Aluno
		private Object[] objetos = new Object[100000];
		private int totalDeObjetos = 0;
		
		
		private void garanteEspaco() {
			if(this.totalDeObjetos == this.objetos.length) {
				Object[] novoArray = new Object[this.objetos.length * 2];
				for(int i = 0; i < this.objetos.length; i++) {
					novoArray[i] = this.objetos[i];
				}
				this.objetos = novoArray;
			}
		}
		public void adiciona(Object objeto) {
			
			this.garanteEspaco();
			this.objetos[this.totalDeObjetos] = objeto;
			this.totalDeObjetos++;
		}
		
		public void adiciona(int posicao, Object objeto) {
			this.garanteEspaco();
			if(!this.posicaoValida(posicao)) {
				throw new IllegalArgumentException("Posicao invalida");
			}
			
			for(int i  =this.totalDeObjetos -1; i >= posicao; i--) {
				this.objetos[i + 1] = this.objetos[i];
			}
			
			this.objetos[posicao] = objeto;
			this.totalDeObjetos++;
			
		}
		
		private boolean posicaoValida(int posicao) {
			return posicao >=0 && posicao <= this.totalDeObjetos;
		}
		public Object pega(int posicao) {
			
			if(!this.posicaoOcupada(posicao)) {
				throw new IllegalArgumentException("Posicao invalida");
			}
			return this.objetos[posicao];
		}
		
		private boolean posicaoOcupada(int posicao) {
			return posicao >= 0 && posicao < this.totalDeObjetos;
		}
		public void remove(int posicao) {
			
			if(!this.posicaoOcupada(posicao)) {
				throw new IllegalArgumentException("Posicao Invalida");
			}
			
			for(int i = posicao; i < this.totalDeObjetos -1; i++) {
				this.objetos[i] = this.objetos[i + 1];
			}
			this.totalDeObjetos--;
		}
		
		public boolean contem(Aluno aluno) {
		
			for(int i = 0; i < this.totalDeObjetos; i++) {
				if(aluno == this.objetos[i]) {
					return true;
				}
				
			}
			return false;
		}
		
		public int tamanho() {
			return this.totalDeObjetos;
		}
		
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
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
			
			builder.append(this.objetos[this.totalDeObjetos -1 ]);
			builder.append("]");
			
			return builder.toString();
		}
		


}
