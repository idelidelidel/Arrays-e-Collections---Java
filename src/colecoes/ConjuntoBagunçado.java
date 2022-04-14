package colecoes;

import java.util.HashSet;

public class ConjuntoBagunçado {

	public static void main(String[] args) {
		
		
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("Tamanho é = " + conjunto.size());
		
		//Tentando adicionar elementos repitidos
		conjunto.add("Teste");
		conjunto.add('x');
		
		//verificando se o tamanho mudou:
		System.out.println("Tamanho é = " + conjunto.size());
		
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto);
	}
}
