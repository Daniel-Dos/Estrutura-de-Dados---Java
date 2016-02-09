package br.com.caelum.ed.conjuntos.Testes;

import java.util.HashSet;

/**
 * @author Daniel Dias
 *
 */
public class TesteHashSet {
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add("Rafale");
		conjunto.add("Rafael");
		conjunto.add("ana");
		conjunto.add("Paulo");
		
		System.out.println(conjunto);
	}

}
