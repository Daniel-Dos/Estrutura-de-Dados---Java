package br.com.caelum.ed.conjuntos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.swing.plaf.synth.SynthSeparatorUI;

/**
 * @author Daniel Dias
 *
 */
public class ConjuntoEspalhamento {

	private ArrayList<LinkedList<String>> tabela = new ArrayList<LinkedList<String>>();
	private int tamanho = 0;
	
	public void imprimeTabela() {
		
		for(List<String> lista : this.tabela) {
			System.out.println("[");
			
			for(int i = 0; i < lista.size(); i++) {
				System.out.println("Daniel");
			}
			System.out.println("]");
		}
	}
	
	//calcular espalhamento
	private int calculaCodigoDeEspalhamento(String palavra) {
		int codigo =1;
		for(int i = 0; i < palavra.length(); i++) {
			codigo = 31 * codigo + palavra.charAt(i);
		}
		return codigo;
	}
	
	//funçao espalhamento
	private int calculaIndiceDaTabela(String palavra) {
		
		int codigoDeEspalhamento = this.calculaCodigoDeEspalhamento(palavra);
		codigoDeEspalhamento = Math.abs(codigoDeEspalhamento); // obterm o valor absoluto do codigo de espalhamento
		return codigoDeEspalhamento % this.tabela.size();
	}
	public ConjuntoEspalhamento() {

		for (int i = 0; i < 26; i++) {
			LinkedList<String> lista = new LinkedList<String>();
			tabela.add(lista);

		}
	}

	public void adiciona(String palavra) {

		//adicionar uma palavra e verifica se contem
		
		if(!this.contem(palavra)) {
			this.verificaCarga();
		int indice = this.calculaIndiceDaTabela(palavra);
		List<String> lista = this.tabela.get(indice);
		lista.add(palavra);
		
		}
	}

	public void remove(String palavra) {

		if(this.contem(palavra)) {
			int indice = this.calculaIndiceDaTabela(palavra);
			List<String> lista = this.tabela.get(indice);
			lista.remove(palavra);
			this.verificaCarga();
		}
	}

	public boolean contem(String palavra) {
		
		//verifuca se esta ou nao no conjunto
		
		int indice = this.calculaIndiceDaTabela(palavra);
		List<String> lista = this.tabela.get(indice);
		return lista.contains(palavra);
	}

	//pegar todas as palavras do conjunto
	public List<String> pegaTodo() {
		List<String> palavras = new ArrayList<String>();
		
		for(int i = 0; i < this.tabela.size(); i ++) {
			palavras.addAll(this.tabela.get(i));
		}
		return palavras;
	}

	//informar o tamnho do conjuto de palavras
	public int tamanho() {

		return this.tamanho;
	}
	
	//redimensionartabela
	private void redimensionarTabela(int novaCapacidade) {
		List<String> palavras = this.pegaTodo();
		this.tabela.clear();
		
		for(int i = 0; i < novaCapacidade;i++) {
			this.tabela.add(new LinkedList<String>());
		}
		
		//palavras.forEach(palavra -> this.adiciona(palavra));
		for(String palavra : palavras) {
			this.adiciona(palavra);
		}
	}
	
	//verificar a carga
	private void verificaCarga() {
		int capacidade = this.tabela.size();
		double carga  = (double) this.tamanho / capacidade;
		
		if(carga > 0.75) {
			this.redimensionarTabela(capacidade * 2);
		} else if (carga < 0.25) {
			this.redimensionarTabela(Math.max(capacidade / 2, 10));
			
			
		}
	}

}
