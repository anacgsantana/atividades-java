//Leia o valor do raio de um círculo e calcule e imprima a área do círculo correspondente. 
//A área do círculo é: pi * raio ao quadrado, considere pi = 3.141592.

package atividades;
import java.util.*;
public class Ex34 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Informe o valor do raio do círculo");		
		double r = sc.nextDouble();
		
		double calculo = ((Math.pow(r, 2)) * 3.141592);
		System.out.print(calculo);
		

	}

}
