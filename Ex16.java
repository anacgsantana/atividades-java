//Leia um valor de comprimento em polegadas e apresente-o convertido em cm. A fórmula de conversão é:
// C = P * 2.54, sendo C o comprimento em cm e P o comprimento em polegadas.


package atividades;

public class Ex16 {

	public static void main(String[] args) {
		double P = 5;
		double C = (P * 2.54);
		System.out.printf("A conversão de polegadas em cm é: %.1f",C);

	}

}
