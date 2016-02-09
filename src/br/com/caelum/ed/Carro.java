package br.com.caelum.ed;

/**
 * @author Daniel Dias
 *
 */
public class Carro {
	
	private String nome;
	private String marca;
	private String cor;
	private int ano;
	
	
	/**
	 * @param string
	 */
	public Carro(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String toString() {
		return "Carro : " + this.nome;
	}

}
