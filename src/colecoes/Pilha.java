package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		
		//Adicionar elementos na pilha
		livros.push("O Pequeno Principe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		for (String string : livros) {
			System.out.println(string);
		}
		System.out.println();
		//Apenas mostrar o primeiro da pilha
		System.out.println(livros.peek());
		System.out.println(livros.peek());
		
		System.out.println("Remoção dos livros: "); //Do topo da pilha para baixo
		
		System.out.println(livros.pop());
		System.out.println(livros.pop());
		System.out.println(livros.pop()); //pop retorna exceção se a pilha estiver vazia
	
		System.out.println(livros.isEmpty());
	}
}
