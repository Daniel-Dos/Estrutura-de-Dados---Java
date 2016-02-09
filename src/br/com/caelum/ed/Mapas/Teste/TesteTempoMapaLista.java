package br.com.caelum.ed.Mapas.Teste;

import br.com.caelum.ed.Carro;
import br.com.caelum.ed.Mapas.MapaLista;

/**
 * @author Daniel Dias
 *
 */
public class TesteTempoMapaLista {
	public static void main(String[] args) {
		
		MapaLista mapaLista = new MapaLista();
		
		int numeroDeElementos = 15000;
		long inicio = System.currentTimeMillis();
		
		for(int i = 0; i < numeroDeElementos; i++) {
			mapaLista.adiciona("" + i, new Carro("C" + i));
		}
		
		for(int i = 0; i < numeroDeElementos; i++) {
			mapaLista.pega("" + i);
		}
		
		for(int i = 0; i < numeroDeElementos; i++) {
			mapaLista.contemChava("" + i);
		}
		
		for(int i = 0; i < numeroDeElementos; i++) {
			mapaLista.remove("" + i);
		}
		
		long fim = System.currentTimeMillis();
		
		System.out.println("Tempo : " + (fim - inicio)  / 1000.0);
	}

}
