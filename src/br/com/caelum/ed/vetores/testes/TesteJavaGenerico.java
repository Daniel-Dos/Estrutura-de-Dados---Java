package br.com.caelum.ed.vetores.testes;

import java.util.ArrayList;

import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.vetores.VetorGenerico;

/**
 * @author Daniel Dias
 *
 */
public class TesteJavaGenerico {
	public static void main(String[] args) {
		
		ArrayList<Aluno> vetor = new ArrayList<Aluno>();
		
		VetorGenerico vetorG = new VetorGenerico();
		
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		
	   a1.setNome("Daniel");
	   a2.setNome("Dias");
	   
	   vetor.add(a1);
	   vetor.add(a2);
	   vetor.add(a1);
	   
  vetorG.adiciona(vetor);
  
  //System.out.println(vetorG);
  
  //vetor.forEach(System.out::println);
  
  System.out.println(vetorG.tamanho());
  
  

		
		
	}

}
