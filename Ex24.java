//Leia um valor de área em metros quadrados e apresente-o convertido em acres. A fórmula de conversão é: 
//A = M * 0,000247 , sendo M a área em metros quadrados e A a área em acres. 
package atividades;

public class Ex24 {

	public static void main(String[] args) {
		double M = 56;
		double A = (M * 0.000247);
		System.out.printf("A conversão de metros em acres é de: %.7f",A);
	}

}
