//Leia uma dist�ncia em quil�metros e apresente-a convertida em milhas. A f�rmula de convers�o �:
// M = K/1.61 * M, sendo K a dist�ncia em km e M em milhas. 
package atividades;

public class Ex13 {

	public static void main(String[] args) {
		double K = 60;
		double M = (K / 1.61);
		System.out.printf("A convers�o de km para milhas �: %.2f", M);

	}

}
