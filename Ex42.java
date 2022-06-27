//Receba o salário base de um  funcionário. Calcule e imprima o salário a receber, sabendo-se que esse 
//funcionário tem uma gratificação de 5% sobre o salário base. Além disso, ele paga 7% de imposto sobre o 
//salário base. 

package atividades;
import java.util.*;

public class Ex42 {

	public static void main(String[] args) {
		Scanner sl = new Scanner(System.in);
		System.out.println("Informe o salário base em: R$ ");
		Double reais = sl.nextDouble();
		
		Double extra = (reais * 0.5) + reais;
		Double desc = (extra *0.7);
		
		System.out.print(desc);
		
	}

}
