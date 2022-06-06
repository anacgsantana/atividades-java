//Leia um valor de comprimento em metros e apresente-o convertido em jardas. A fórmula de conversão é: 
//J = M / 0,91 , sendo J o comprimento em jardas e M o comprimento em metros. 
package atividades;

public class Ex23 {

	public static void main(String[] args) {
		double M = 5;
		double J = ( M / 0.91);
		System.out.printf("A conversão de metros em jardas é de: %.2f",J);
	}

}
