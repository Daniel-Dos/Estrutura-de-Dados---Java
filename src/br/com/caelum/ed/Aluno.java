package br.com.caelum.ed;

/**
 * @author Daniel Dias
 *
 */
public class Aluno {
	
	private String nome;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nome;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Aluno outro = (Aluno) obj;
		return this.nome.equals(outro.nome);
	}
	
	
	
}
