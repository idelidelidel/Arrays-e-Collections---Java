package colecoes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
	
	public static void main(String[] args) {
		
		//HashSet nao 'respeita' ordem de insercao
		Set<String> listaAprovados = new HashSet<String>();
		
		listaAprovados.add("Olavo");
		listaAprovados.add("Ryan");
		listaAprovados.add("Ilde");
		listaAprovados.add("Lucas");
		listaAprovados.add("Borges");
		
		for (String candidatos : listaAprovados) {
			System.out.println(candidatos);
		}
		
		System.out.println();
		System.out.println();
		
		//TreeSet 'respeita' uma ordem, nesse caso, alfabetica
		TreeSet<String> listaAprovados2 = new TreeSet<String>();
		
		listaAprovados2.add("Olavo");
		listaAprovados2.add("Ryan");
		listaAprovados2.add("Ilde");
		listaAprovados2.add("Lucas");
		listaAprovados2.add("Borges");
		
		for (String string : listaAprovados2) {
			System.out.println(string);
		}
		
	}

}
