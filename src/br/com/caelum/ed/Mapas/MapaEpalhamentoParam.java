package br.com.caelum.ed.Mapas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Daniel Dias
 *
 */
public class MapaEpalhamentoParam<C,V> {

	private List<List<AssociacaoParam<C,V>>> tabela = new ArrayList<List<AssociacaoParam<C,V>>>();

	/**
	 * 
	 */
	public MapaEpalhamentoParam() {
		
		for(int i = 0; i < 100; i++) {
			this.tabela.add(new LinkedList<AssociacaoParam<C,V>>());
		}
	}
	
	public boolean contemChave(C chave) {
		
		int indice = this.calculaIndeceDaTabela(chave);
		List<AssociacaoParam<C, V>> lista = this.tabela.get(indice);
		
		for(int i = 0; i < lista.size(); i++) {
			AssociacaoParam<C, V> associacao = lista.get(i);
			if(associacao.getChave().equals(chave)) {
				return true;
			}
		}
		
		return false;
	}
	
	
	public void remove(C chave) {
		int indice = this.calculaIndeceDaTabela(chave);
		List<AssociacaoParam<C, V>> lista =this.tabela.get(indice);
		
		for(int i = 0; i < lista.size(); i++) {
			AssociacaoParam<C, V> associacao = lista.get(i);
			if(associacao.getChave().equals(chave)) {
				lista.remove(i);
				return;
			}
		}
		throw new IllegalArgumentException("A chave nao eixste");
	}
	
	public void adiciona(C chave, V valor) {
		if(this.contemChave(chave)) {
			this.remove(chave);
		}
		
		int indice = this.calculaIndeceDaTabela(chave);
		List<AssociacaoParam<C, V>> lista = this.tabela.get(indice);
		lista.add(new AssociacaoParam<C,V>(chave, valor));
	}
	
	public V pega(C chave) {
		int indice = this.calculaIndeceDaTabela(chave);
		List<AssociacaoParam<C, V>> lista = this.tabela.get(indice);
		
		for(int i = 0; i < lista.size(); i++) {
			AssociacaoParam<C, V> associacao = lista.get(i);
			if(associacao.getChave().equals(chave)) {
				return associacao.getValor();
			}
		}
		
		throw new IllegalArgumentException("A chave nao existe");
	}
	
	private int calculaIndeceDaTabela(C chave) {
		return Math.abs(chave.hashCode()) % this.tabela.size();
	}
	
	private List<AssociacaoParam<C, V>> pegaTodas() {
		ArrayList<AssociacaoParam<C, V>> associacaoes = new ArrayList<AssociacaoParam<C,V>>();
		
		associacaoes.forEach( lista -> associacaoes.addAll((Collection<? extends AssociacaoParam<C, V>>) this.tabela));
		return associacaoes;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.pegaTodas().toString();
	}
}
