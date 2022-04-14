package TrababalhandoComArrays;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		
		int quantidadeNotas,soma=0;
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Digite a quantidade de notas : ");
		quantidadeNotas = teclado.nextInt();
		
		double[] notas = new double[quantidadeNotas];
		
		for (double nota : notas) {
			System.out.println("Digite uma nota: ");
			nota = teclado.nextDouble();
			soma+=nota;
		}
		
		System.out.println("Media = "+soma/notas.length);
		
		teclado.close();
	}
}
