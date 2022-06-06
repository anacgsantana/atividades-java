//Leia uma temperatura em graus Celsius e apresente-a convertida em graus Fahrenheit. 
//A fórmula de conversão é: F = C * (9.0/5.0)+32, sendo F a temperatura em Fahrenheit 
// e C a temperatura em Celsius.
package atividades;

public class Ex06 {

	public static void main(String[] args) {
		double C = 28.0;
		double F = (C * (9.0/5.0)+32);
		System.out.println("A temperatura após conversão para temperatura Fahrenheit é de " + F);

	}

}
