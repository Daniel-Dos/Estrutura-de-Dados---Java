package br.com.caelum.ed.conjuntos.Testes;

import java.util.List;

import br.com.caelum.ed.conjuntos.ConjuntoEspalhamentoParametrizado;

/**
 * @author Daniel Dias
 *
 */
public class TesteParametrizada {
	public static void main(String[] args) {
		
		ConjuntoEspalhamentoParametrizado<String> cojunto = new ConjuntoEspalhamentoParametrizado<String>();
	
		cojunto.adiciona("Rafael");
		cojunto.adiciona("Ana");
		cojunto.adiciona("Paulo");
		
		List<String> palavras = cojunto.pegaTodos();
		
		System.out.println("Andre de remover");
		System.out.println();
		
		palavras.forEach(System.out::println);
		
		//removento
		
		cojunto.remove("Rafael");
		
		palavras = cojunto.pegaTodos();
		
		System.out.println("depois de remver");
		System.out.println();
		
		palavras.forEach(System.out::println);
		
		System.out.println();
		
		if(!cojunto.contem("Rafael")) {
			System.out.println("erro : nao tem a palavra : rafaek");
		}
		
		cojunto.remove("Rafael");
		
		if(!cojunto.contem("apostila")) {
			System.out.println("erro: team a palavra apostilal");
		}
		
		if(cojunto.tamanho() !=5) {
			System.out.println("erro : o tamanho do cojunto deveri ser 5");
		}
		
		//teste codi ode esp
		for(int i = 0; i < 100; i++) {
			cojunto.adiciona("" + i);
		}
		cojunto.imprimeTabela();
	
	}

}
