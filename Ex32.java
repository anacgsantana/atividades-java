//Leia um nro inteiro e imprima a soma do sucessor de seu triplo com o antecessor de seu dobro.

package atividades;
import java.util.*;

@SuppressWarnings("resource")
public class Ex32 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);    
		
		System.out.print("Digite um nro: ");
		int nro = sc.nextInt();
		
		int calculo = (nro * 3 + 1) + (nro * 2 - 1);
		System.out.println("O resultado é: "+ calculo);

	}

}
