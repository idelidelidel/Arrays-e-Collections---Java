package TrababalhandoComArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Quantos alunos? ");
		int quantidadeAlunos = teclado.nextInt();
		
		System.out.println("Quantas notas por aluno? ");
		int quantidadeNotas = teclado.nextInt();
		
		double[][] notasDaTurma = new double[quantidadeAlunos][quantidadeNotas];
		double mediaTurma = 0;
		
		for (int i = 0; i < notasDaTurma.length; i++) {
			for (int j = 0; j < notasDaTurma[i].length; j++) {
				System.out.printf("Digite a note %d do aluno %d: ",i+1,j+1);
				notasDaTurma[i][j] = teclado.nextDouble();
				mediaTurma+= notasDaTurma[i][j];
			}
		}
		mediaTurma /= (quantidadeAlunos*quantidadeNotas); 
		System.out.println("A media da turma é = " +mediaTurma);
		
		for(double[] notasDoAluno : notasDaTurma) {
			System.out.println(Arrays.toString(notasDoAluno));
		}
	
		teclado.close();
		
		
	}
}
