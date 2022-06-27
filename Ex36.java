//Leia a altura e o raio de um cilindro circular e imprima o volume do cilindro. O volume de um cilindro
//circular é calculado por meio da seguinte fórmula: Volume = pi * raio ao quadrado * altura. Onde, pi = 3.141592

package atividades;
import java.util.*;
public class Ex36 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Informe a altura do cilindro: ");		
		double altura = sc.nextDouble();
		
		System.out.println("Informe o raio do cilindro: ");		
		double raio = sc.nextDouble();
		
		double volume = (3.141592 * (raio * raio) * altura);
		
		System.out.print(volume);
		
		

	}

}
