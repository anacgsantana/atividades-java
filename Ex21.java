//Leia um valor de massa em libras e apresente-o convertido em quilogramas. A fórmula de conversão é:
// K = L * 0,45 , sendo K a massa em quilogramas e L a massa em libras.

package atividades;

public class Ex21 {

	public static void main(String[] args) {
		double L = 5;
		double K = (L * 0.45);
		System.out.printf("A conversão de libras em quilogramas é de: %.2f",K);
	}

}
