//Leia o salário de um funcionário. Calcule e imprima o valor do novo salário, sabendo que ele recebeu um aumento de 25%


package atividades;
import java.util.*;

public class Ex39 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);  		
		System.out.print("Informe o salário atual do funcionário que teve aumento: ");
		
		double salario = sc.nextInt();
		double aumento = salario * 0.25 + salario;
		
		System.out.println("O resultado é: "+ aumento);


	}

}
