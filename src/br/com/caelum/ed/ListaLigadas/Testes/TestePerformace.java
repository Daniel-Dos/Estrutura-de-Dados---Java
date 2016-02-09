package br.com.caelum.ed.ListaLigadas.Testes;

import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.plaf.synth.SynthSeparatorUI;

/**
 * @author Daniel Dias
 *
 */
public class TestePerformace {
	public static void main(String[] args) {
		
		ArrayList<String> vetor = new ArrayList<String>();
		LinkedList<String> lista = new LinkedList<String>();
		int numeroDeElementos = 40000;
		
		//add no come�o
		
		long inicio = System.currentTimeMillis();
		
		for(int i = 0; i < numeroDeElementos; i++) {
			vetor.add(0,"" +i);
		}
		
		long fim = System.currentTimeMillis();
		System.out.println("Vetor adiciona no come�o : " + (fim - inicio) / 100.0);
		
		inicio = System.currentTimeMillis();
		
		for(int i = 0; i < numeroDeElementos; i++) {
			lista.add(0,"" + i);
		}
		
		fim = System.currentTimeMillis();
		System.out.println("lista ligada adiciona no come�o :" + (fim - inicio) / 1000.0);
		
		//percorrendo 
		
		inicio = System.currentTimeMillis();
		
		for(int i=0; i < numeroDeElementos; i++) {
			vetor.get(i);
		}
		
		fim = System.currentTimeMillis();
		System.out.println("Vetor percorriod : " + (fim - inicio) / 1000.0);
		
		inicio = System.currentTimeMillis();
		
		for(int i = 0 ; i < numeroDeElementos; i++) {
			lista.get(i);
		}
		
		fim = System.currentTimeMillis();
		System.out.println("Lista ligada percorrendo :" + (fim - inicio) / 1000.0);
		
		
		//removendo do come�o
		inicio = System.currentTimeMillis();
		
		for(int i = 0; i < numeroDeElementos;i++) {
			vetor.remove(0);
		}
		
		fim = System.currentTimeMillis();
		System.out.println("Vetor remove do come�o :" + (fim - inicio) / 1000.0);
		
		inicio = System.currentTimeMillis();
		
		for(int i = 0 ; i < numeroDeElementos; i++) {
			lista.remove(0);
		}
		
		inicio = System.currentTimeMillis();
		System.out.println("Lista ligada remove do come�o :" + (fim - inicio) / 1000.0);
		
		
	}

}
