//Leia uma velocidade em km/h e apresente-a convertida em m/s (metros por segundo). A fórmula de conversão é:
// M = K/3.6, sendo K a velocidade em km/h e M em m/s. 
package atividades;

public class Ex10 {

	public static void main(String[] args) {
		double K = 100;
		double M = (K/3.6);		
		System.out.printf("A conversão de km/h para m/s é:\n %.1f", M );

	}

}
