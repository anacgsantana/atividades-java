//Leia um nro em inteiro e imprima o seu antecessor e o seu sucessor

package atividades;
import java.util.*;
public class Ex31 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
		
		System.out.print("Digite um nro: ");
		int nro = sc.nextInt();
		
		int asc = (nro - 1);
		System.out.println("O valor anterior ao nro digitado é: "+ asc);
		
		int desc = (nro + 1);
		System.out.println("O valor sucessor ao nro digitado é: "+ desc);
		
	}

}
