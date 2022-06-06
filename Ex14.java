//Leia um ângulo em graus e apresente-o convertido em radianos. A fórmula de conversão é:
// R = G * pi / 180, sendo G o ângulo em graus e R em radianos e pi = 3.14.
package atividades;

public class Ex14 {

	public static void main(String[] args) {
		double G = 90;
		double R = (G * 3.14)/180;
		System.out.printf("A conversão de graus em radianos é: %.2f", R);
		

	}

}
