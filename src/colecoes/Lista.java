package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
		
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		
		Usuario u1 = new Usuario("Ana");
		
		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Joao"));
		lista.add(new Usuario("Lucas"));
		lista.add(new Usuario("Maria"));
		lista.add(new Usuario("Andre"));
		
		//Acessando pelo indice
		System.out.println("Indice 3: " + lista.get(3));
		
		//Respeita a ordem de insercao
		for (Usuario usuario : lista) {
			System.out.println(usuario);
		}
		
		//Formas de remover
		System.out.println("Removendo por indexamento: "+ lista.remove(2));
		
		//Conferindo se tem o elemento
		System.out.println("Contem Ana? " + lista.contains(new Usuario("Ana")));
		 
		for (Usuario usuario : lista) {
			System.out.println(usuario);
		}
	}
}
