//Leia uma temperatura em graus Kelvin e apresente-a convertida em graus Celsius. A fórmula de conversão é:
// C = K - 273,15 sendo C a temperatura em Celsius e K a temperatura em Kelvin. 
package atividades;

public class Ex08 {

	public static void main(String[] args) {
		double K = 373.15;
		double C = (K - 273.15);
		System.out.println("Após conversão, a temperatura Kelvin para temperatura Celsius é de " + C);
		

	}

}
