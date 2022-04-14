package TrababalhandoComArrays;

import java.util.Arrays;

public class Exercicios {

	public static void main(String[] args) {
		
		//Atributos
		double[] notasAlunoA = new double[3];
		double[] notasAlunoB = {7.1 , 8.7 , 9.6 };
		double totalAlunoA = 0;
		double totalAlunoB = 0;
		
		/*	Outras declaracoes que o Java aceita:
		 * double [] notasAlunoA = new double[3];
		   double notasAlunoA[] = new double[3];
		 */
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		notasAlunoA[0] = 7.2;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 9.5;
		
		for(int i = 0; i<notasAlunoA.length;i++ ) {
			totalAlunoA+=notasAlunoA[i];
		}
		
		System.out.println(totalAlunoA/notasAlunoA.length);
		
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		
		System.out.println(totalAlunoB/ notasAlunoB.length);
		
	}
}
