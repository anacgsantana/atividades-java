//Receba o sal�rio base de um  funcion�rio. Calcule e imprima o sal�rio a receber, sabendo-se que esse 
//funcion�rio tem uma gratifica��o de 5% sobre o sal�rio base. Al�m disso, ele paga 7% de imposto sobre o 
//sal�rio base. 

package atividades;
import java.util.*;

public class Ex42 {

	public static void main(String[] args) {
		Scanner sl = new Scanner(System.in);
		System.out.println("Informe o sal�rio base em: R$ ");
		Double reais = sl.nextDouble();
		
		Double extra = (reais * 0.5) + reais;
		Double desc = (extra *0.7);
		
		System.out.print(desc);
		
	}

}
