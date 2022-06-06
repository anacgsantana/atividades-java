//Leia um valor de volume em litros e apresente-o convertido em mt cúbicos . A fórmula de conversão é:
// M = L / 1000 , sendo L o volume em lt e M o volume em mt cúbicos.


package atividades;

public class Ex19 {

	public static void main(String[] args) {
		double L = 10;
		double M = (L / 1000);
		System.out.printf("A conversão  de litros em mt cúbicos é: %.2f",M);

	}

}
