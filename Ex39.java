//Leia o sal�rio de um funcion�rio. Calcule e imprima o valor do novo sal�rio, sabendo que ele recebeu um aumento de 25%


package atividades;
import java.util.*;

public class Ex39 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);  		
		System.out.print("Informe o sal�rio atual do funcion�rio que teve aumento: ");
		
		double salario = sc.nextInt();
		double aumento = salario * 0.25 + salario;
		
		System.out.println("O resultado �: "+ aumento);


	}

}
