//Leia um ângulo em radianos e apresente-o convertido em graus. A fórmula de conversão é:
// G = R * 180 / pi, sendo G o ângulo em graus e R em radianos e pi = 3.14.

package atividades;

public class Ex15 {

	public static void main(String[] args) {
		double R = 1.57;
		double G = (R * 180) / 3.14;
		System.out.printf("A conversão de radianos em graus é: %.0f", G);

	}

}
