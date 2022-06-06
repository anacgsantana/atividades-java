//Leia uma distância em quilômetros e apresente-a convertida em milhas. A fórmula de conversão é:
// M = K/1.61 * M, sendo K a distância em km e M em milhas. 
package atividades;

public class Ex13 {

	public static void main(String[] args) {
		double K = 60;
		double M = (K / 1.61);
		System.out.printf("A conversão de km para milhas é: %.2f", M);

	}

}
