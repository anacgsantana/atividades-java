//Faça a leitura de 3 valores e apresente como resultado a soma dos quadrados dos três valores lidos. 

package atividades;

import java.util.Scanner;

public class Ex28 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int valor1;
		int valor2;
		int valor3;
			
		 	
			Scanner input1 = new Scanner (System.in);  
	        System.out.print("Digite o primeiro nro: ");  
	        valor1 = input1.nextInt();  
	        
	        Scanner input2 = new Scanner (System.in);  
	        System.out.print("Digite o segundo nro: ");  
	        valor2 = input2.nextInt();  
	        
	        
	        Scanner input3 = new Scanner (System.in);  
	        System.out.print("Digite o segundo nro: ");  
	        valor3 = input3.nextInt();  
	        
	       double soma = (valor1*valor1) + (valor2*valor2) + (valor3*valor3);
	       System.out.printf("O valor da soma dos 3 valores inseridos ao quadrado é: %.2f",soma);
	    
	}

}
