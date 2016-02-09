package br.com.caelum.ed.ListaLigadas;

/**
 * @author Daniel Dias
 *
 */
public class Celula {
	private Celula proxima;
	private Celula anterior;
	private Object elemento;
	
	public Celula(Celula proxima, Object elemento) {
		this.proxima = proxima;
		this.elemento = elemento;
	}
	
      /**
	 * 
	 */
	public Celula(Object elemento) {
		// TODO Auto-generated constructor stub
		this.elemento = elemento;
	}
	
	/**
	 * @param proxima the proxima to set
	 */
	public void setProxima(Celula proxima) {
		this.proxima = proxima;
	}
	
	/**
	 * @return the proxima
	 */
	public Celula getProxima() {
		return proxima;
	}
	
	/**
	 * @return the elemento
	 */
	public Object getElemento() {
		return elemento;
	}
	
	/**
	 * @param elemento the elemento to set
	 */
	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}
	
	/**
	 * @return the anterior
	 */
	public Celula getAnterior() {
		return anterior;
	}
	
	/**
	 * @param anterior the anterior to set
	 */
	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}

}
