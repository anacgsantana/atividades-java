//Leia um valor de área em hectares e apresente-o convertido em metros quadrados. A fórmula de conversão é: 
//M = H * 10000 , sendo M a área em metros quadrados e H a área em hectares

package atividades;

public class Ex27 {

	public static void main(String[] args) {
		double H = 1000;
		double M = (H * 10000);
		System.out.printf("A conversão de hectares em metros é de %.0f",M);
		
	}

}
