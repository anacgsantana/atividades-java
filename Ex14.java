//Leia um �ngulo em graus e apresente-o convertido em radianos. A f�rmula de convers�o �:
// R = G * pi / 180, sendo G o �ngulo em graus e R em radianos e pi = 3.14.
package atividades;

public class Ex14 {

	public static void main(String[] args) {
		double G = 90;
		double R = (G * 3.14)/180;
		System.out.printf("A convers�o de graus em radianos �: %.2f", R);
		

	}

}
