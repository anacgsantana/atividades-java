//Leia o valor do raio de um c�rculo e calcule e imprima a �rea do c�rculo correspondente. 
//A �rea do c�rculo �: pi * raio ao quadrado, considere pi = 3.141592.

package atividades;
import java.util.*;
public class Ex34 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Informe o valor do raio do c�rculo");		
		double r = sc.nextDouble();
		
		double calculo = ((Math.pow(r, 2)) * 3.141592);
		System.out.print(calculo);
		

	}

}
