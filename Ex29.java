//Leia quatro notas,calcule a média aritmética e imprima o resultado

package atividades;

import java.util.*; 
public class Ex29 {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		double nota1;
		double nota2;
		double nota3;
		double nota4;
	
		Scanner input1 = new Scanner (System.in);  
	        System.out.print("Informe a primeira nota: ");  
	        nota1 = input1.nextInt();
	        
	    Scanner input2 = new Scanner (System.in);  
	        System.out.print("Informe a segunda nota: ");  
	        nota2 = input2.nextInt();
	        
	     Scanner input3 = new Scanner (System.in);  
	        System.out.print("Informe a terceira nota: ");  
	        nota3 = input3.nextInt();
	        
	     Scanner input4 = new Scanner (System.in);  
	        System.out.print("Informe a quarta nota: ");  
	        nota4 = input4.nextInt();
	        
	     double media = (nota1+ nota2 + nota3 + nota4) / 4;
	     
	     System.out.printf("A média das quatro notas é %.2f", media);
	}

}
