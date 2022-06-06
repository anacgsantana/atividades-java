//Peça ao usuário para digitar 3 valores inteiros e imprima a soma deles 

package atividades;
import java.util.Scanner;
public class Ex03 {

	public static void main(String[] args) {
		Scanner nros = new Scanner(System.in);
		
		
		System.out.println("Type the first number");
		int n1 = nros.nextInt();
		
		System.out.println("Type another number");
		int n2 = nros.nextInt();
		
		System.out.println("Type the third number");
		int n3 = nros.nextInt();
		
		int sum = (n1 + n2 + n3);
		System.out.println("The sum is "+ sum);
	}
	
}
