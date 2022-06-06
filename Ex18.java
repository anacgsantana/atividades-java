//Leia um valor de volume em mt cúbicos e apresente-o convertido em litros. A fórmula de conversão é:
// L = 1000  * M, sendo L o volume em lt e M o volume em mt cúbicos.

package atividades;

public class Ex18 {

	public static void main(String[] args) {
		double M = 1;
		double L = (1000  * M);
		System.out.printf("A conversão de mt cúbicos em litros é %.0f",L);

	}

}
