package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
	
		//Offer e add -> Adicionam elementos na fila
		//Diferen� � o comportamento quando a fila est� cheia. Fila est� cheia?
		//add retorna exce��o
		//offer retorna falso
	
		fila.add("Ana");
		fila.offer("Bia");
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Idel");
		
		/*Peek e elements -> obtem o proximo elemento da fila (sem remover) da fila
		 * Diferen�a � quando a fila est� vazia
		 * Peek retorna null
		 * Elements retorna uma exce��o
		 */
	
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.element());
	
		fila.size(); //tamanho da fila
	//	fila.clear(); //limpar a fila
		fila.isEmpty(); //boolean para fila vazia ou nao
		
		/*poll e remove obtem um elemento e removem ele da fila
		 * Diferen�a � que quando fila est� vazia
		 * poll retorna null
		 * remove retorna exce��o
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
