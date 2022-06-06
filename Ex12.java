//Leia uma distância em milhas e apresente-a em quilômetros. A fórmula de conversão é:
// K = 1.61 * M, sendo K a distância em quilômetros e M em milhas. 
package atividades;

public class Ex12 {

	public static void main(String[] args) {
		double M = 60;
		double K = (1.61 * M);
		System.out.printf("A conversão de milhas para km é: %.2f", K);

	}

}
