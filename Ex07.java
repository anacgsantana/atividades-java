//Leia uma temperatura em graus Fahrenheit e apresente-a convertida em graus Celsius. 
//A fórmula de conversão é: C = 5.0 * (F - 32.0)/9.0, sendo C a temperatura em Celsius 
// e F a temperatura em Fahrenheit.

package atividades;

public class Ex07 {

	public static void main(String[] args) {
		double F = 82.4;
		double C = (5.0 * (F - 32.0)/9.0);
		System.out.println("A temperatura após conversão para temperatura Celsius é de " + C);

	}

}
