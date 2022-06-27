//Faça um programa que leia o valor de um produto e imprima o valor com desconto, tendo em vista que o desconto foi de 12%

package atividades;
import java.util.*;
public class Ex37 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Informe o valor do produto ");
		double produto = sc.nextDouble();
		
		double desconto = (1 - 0.12);
		double total = (produto * desconto );
		System.out.printf("%.2f",total);
		

	}

}
