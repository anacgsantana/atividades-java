//Uma empresa contrata um encanador a R$30,00 por dia. Fa�a um programa que solicite o nro de dias 
//trabalhados pelo encanador e imprima a quantia l�quida que dever� ser paga, sabendo-se 
//que s�o descontados 8% para IR
package atividades;
import java.util.*;

public class Ex40 {

	public static void main(String[] args) {
		Scanner dias = new Scanner(System.in);
		System.out.println("Nro de dias trabalhados: ");
		
		double calc = dias.nextInt();
		double diaria = 30;
		double pgto = (calc * diaria) - 0.8;
		
		System.out.println("O trabalhador dever� receber a quantia l�quida de: " + pgto + " reais");
		

	}

}
