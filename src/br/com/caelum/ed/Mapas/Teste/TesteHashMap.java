package br.com.caelum.ed.Mapas.Teste;

import java.util.HashMap;

import br.com.caelum.ed.Carro;
import br.com.caelum.ed.Mapas.MapaEpalhamentoParam;

/**
 * @author Daniel Dias
 *
 */
public class TesteHashMap {
	public static void main(String[] args) {

		
		HashMap<String, Carro> mapa = new HashMap<String, Carro>();

		mapa.put("abc1234", new Carro("a"));

		System.out.println(mapa);

		mapa.put("abc1234", new Carro("b"));

		System.out.println(mapa);

		mapa.put("abc1234", new Carro("c"));

		System.out.println(mapa);
		
		System.out.println(mapa.containsKey("abc1234"));
		System.out.println(mapa.get("abc1234"));
		mapa.remove("abc1234");
		System.out.println(mapa);
		
		
		
		/*
		MapaEpalhamentoParam<String, Carro> mapas = new MapaEpalhamentoParam<String,Carro>();
		
		mapas.adiciona("abc1234", new Carro("A"));
		
		
		mapas.adiciona("abc1234", new Carro("B"));
		
		
		mapas.adiciona("abc1234", new Carro("C"));
		
		
		System.out.println(mapas.contemChave("abc1234"));
		System.out.println(mapas.pega("abc1234"));
		mapas.remove("abc1234");
		System.out.println(mapas);
		
		
		*/
		
	}

}
