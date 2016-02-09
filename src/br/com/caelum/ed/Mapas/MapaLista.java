package br.com.caelum.ed.Mapas;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.ed.Carro;

/**
 * @author Daniel Dias
 *
 */
public class MapaLista {
	
	private List<Associacao> associados = new ArrayList<Associacao>();
	
	public void adiciona(String placa, Carro carro) {
		if(!this.contemChava(placa)) {
			Associacao associacao = new Associacao(placa, carro);
			this.associados.add(associacao);
		}
	}
	
	public Carro pega(String placa) {
		
		for(Associacao associacao : this.associados) {
			if(placa.equals(associacao.getPlaca())) {
				return associacao.getCarro();
			}
		}
		
		throw new IllegalArgumentException("Chave nao existe");
	}
	
	public void remove(String placa) {
		
		if(this.contemChava(placa)) {
			for(int i =0; i < this.associados.size(); i++) {
				Associacao associado = this.associados.get(i);
				
				if(placa.equals(associado.getPlaca())) {
					this.associados.remove(i);
					break;
				}
			}
		} else {
			throw new IllegalArgumentException("Chave nao existe");
		}
	}
	
	public Boolean contemChava(String placa) {
		for(Associacao associacao : this.associados) {
			
			if(placa.equals(associacao.getPlaca())) {
				return true;
			}
		}
		return false;
	}
	
	public int tamanho() {
		return this.associados.size();
	}

}
