//Leia um �ngulo em radianos e apresente-o convertido em graus. A f�rmula de convers�o �:
// G = R * 180 / pi, sendo G o �ngulo em graus e R em radianos e pi = 3.14.

package atividades;

public class Ex15 {

	public static void main(String[] args) {
		double R = 1.57;
		double G = (R * 180) / 3.14;
		System.out.printf("A convers�o de radianos em graus �: %.0f", G);

	}

}
