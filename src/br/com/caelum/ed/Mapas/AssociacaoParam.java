package br.com.caelum.ed.Mapas;

/**
 * @author Daniel Dias
 *
 */
public class AssociacaoParam<C, V> {

	private C chave;
	private V valor;

	/**
	 * 
	 */
	public AssociacaoParam(C chave, V valor) {
		// TODO Auto-generated constructor stub

		this.chave = chave;
		this.valor = valor;
	}

	/**
	 * @return the chave
	 */
	public C getChave() {
		return chave;
	}

	/**
	 * @param chave
	 *            the chave to set
	 */
	public void setChave(C chave) {
		this.chave = chave;
	}

	/**
	 * @param valor
	 *            the valor to set
	 */
	public void setValor(V valor) {
		this.valor = valor;
	}

	/**
	 * @return the valor
	 */
	public V getValor() {
		return valor;
	}

	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{" + this.chave + " -> " + this.valor + "}";
	}
}
