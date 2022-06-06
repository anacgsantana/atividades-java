//Leia uma velocidade em m/s (metros por segundo) e apresente-a convertida em km/h. A fórmula de conversão é:
// K = M * 3.6, sendo K a velocidade em km/h e M em m/s. 
package atividades;

public class Ex11 {

	public static void main(String[] args) {
		double M = 60; 
		double K = (M * 3.6);
		System.out.printf("A conversão de m/s para km/h é:\n %.0f", K );

	}

}
