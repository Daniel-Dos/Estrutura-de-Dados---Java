package br.com.caelum.ed.Filas.Testes;

import javax.swing.plaf.synth.SynthSeparatorUI;

import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.Filas.Fila;

/**
 * @author Daniel Dias
 *
 */
public class TesteFila {
	public static void main(String[] args) {
		
		Fila<Aluno> fila = new Fila<Aluno>();
		
		Aluno aluno = new Aluno();
		fila.insere(aluno);
		
		Aluno alunoRemovido = fila.remove();
		
		if(fila.vazia()) {
			System.out.println("Fila Vazia");
		}
		
		Fila<String> fila2 = new Fila<String>();
		
		fila2.insere("Adelane");
		fila2.insere("carolina");
		
		String carolina = fila2.remove();
		String adelane = fila2.remove();
		
		System.out.println(carolina);
		System.out.println(adelane);
	}

}
