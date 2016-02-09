package br.com.caelum.ed.Mapas;

import br.com.caelum.ed.Carro;

/**
 * @author Daniel Dias
 *
 */
public class Associacao {

	private String placa;
	private Carro carro;

	public Associacao(String placa, Carro carro) {
		super();
		this.placa = placa;
		this.carro = carro;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

}
