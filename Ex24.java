//Leia um valor de �rea em metros quadrados e apresente-o convertido em acres. A f�rmula de convers�o �: 
//A = M * 0,000247 , sendo M a �rea em metros quadrados e A a �rea em acres. 
package atividades;

public class Ex24 {

	public static void main(String[] args) {
		double M = 56;
		double A = (M * 0.000247);
		System.out.printf("A convers�o de metros em acres � de: %.7f",A);
	}

}
