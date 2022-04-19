package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
	
		//Offer e add -> Adicionam elementos na fila
		//Diferenã é o comportamento quando a fila está cheia. Fila está cheia?
		//add retorna exceção
		//offer retorna falso
	
		fila.add("Ana");
		fila.offer("Bia");
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Idel");
		
		/*Peek e elements -> obtem o proximo elemento da fila (sem remover) da fila
		 * Diferença é quando a fila está vazia
		 * Peek retorna null
		 * Elements retorna uma exceção
		 */
	
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.element());
	
		fila.size(); //tamanho da fila
	//	fila.clear(); //limpar a fila
		fila.isEmpty(); //boolean para fila vazia ou nao
		
		/*poll e remove obtem um elemento e removem ele da fila
		 * Diferença é que quando fila está vazia
		 * poll retorna null
		 * remove retorna exceção
		 */
		
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll()); 
	}
}
