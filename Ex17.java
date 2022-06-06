//Leia um valor de comprimento em cm e apresente-o convertido em polegadas. A fórmula de conversão é:
// P = C / 2.54, sendo C o comprimento em cm e P o comprimento em polegadas.

package atividades;

public class Ex17 {

	public static void main(String[] args) {
		double C = 10;
		double P = (C / 2.54);
		System.out.printf("A conversão cm em polegadas é %.2f",P);

	}

}
