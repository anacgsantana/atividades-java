// A import�ncia de R$780.000,00 ser� dividida entre tr�s ganhadores de um concurso. Sendo que da quantia total:

//- O primeiro ganhador receber� 46%
//- O segundo receber� 32%
//- O terceiro receber� o restante 

// Calcule e imprima a quantia ganha por cada um dos ganhadores. 

package atividades;

public class Ex38 {

	public static void main(String[] args) {
		double primeiro = (780.000 * 0.46);
		System.out.printf("O primeiro ganhador recebeu: %.3f \n", primeiro);
		
		double segundo = (780.000 * 0.32);
		System.out.printf("O segundo ganhador recebeu: %.3f \n", segundo);
		
		//double terceiro = (780.000 * 0.22);
		double terceiro = (780.000 - primeiro - segundo);
		System.out.printf("E o terceiro ganhador recebeu: %.3f \n", terceiro);
	}

}
