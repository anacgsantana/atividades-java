//Leia um valor em real e a cota��o do d�lar. Em seguida, imprima o valor correspondente em dol�res. 

package atividades;
import java.util.*;
public class Ex30 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
				
		double real;
		double cotacaodolar;
		
		
		Scanner valor1 = new Scanner (System.in);  
        System.out.print("Informe um valor em real: ");  
        real = valor1.nextDouble();
        
        Scanner valor2 = new Scanner (System.in);  
        System.out.print("Informe a cota��o do d�lar: ");  
        cotacaodolar = valor2.nextDouble();
        
        double conversao =  (real / cotacaodolar); 
        
        System.out.printf("O valor correspondente em d�lares � de:  %.2f", conversao);
		 

	}

}
