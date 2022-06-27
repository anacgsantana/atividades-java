//Uma empresa contrata um encanador a R$30,00 por dia. Faça um programa que solicite o nro de dias 
//trabalhados pelo encanador e imprima a quantia líquida que deverá ser paga, sabendo-se 
//que são descontados 8% para IR
package atividades;
import java.util.*;

public class Ex40 {

	public static void main(String[] args) {
		Scanner dias = new Scanner(System.in);
		System.out.println("Nro de dias trabalhados: ");
		
		double calc = dias.nextInt();
		double diaria = 30;
		double pgto = (calc * diaria) - 0.8;
		
		System.out.println("O trabalhador deverá receber a quantia líquida de: " + pgto + " reais");
		

	}

}
