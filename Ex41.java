//Fa�a um programa que leia o valor da hora de trabalho (em reais) e n�mero de horas trabalhadas
//no m�s. Imprima o valor a ser pago ao funcion�rio, adicionando 10% sobre o valor calculado. 

package atividades;
import java.util.*;
public class Ex41 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner rs = new Scanner(System.in);
		System.out.println("Informe o valor da hora trabalhada em: R$ ");
		Double reais = rs.nextDouble();
		
		Scanner hs = new Scanner(System.in);
		System.out.println("Informe o nro de horas trabalhadas no m�s: ");
		Double horas = hs.nextDouble();
		
		Double pgto1 = (horas * reais);
		Double pgto2 = (pgto1 * 0.10) + pgto1;
		
		System.out.println("O valor a ser pago � de: R$" + pgto2);
		
		
		
		
		
		

	}

}
