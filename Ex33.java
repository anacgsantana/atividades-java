//Leia o tamanho do lado de um quadrado e imprima como resultado a sua área

package atividades;
import java.util.*;
public class Ex33 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);    
		
		System.out.print("Digite o tamanho do lado de um quadrado: ");
		double nro = sc.nextDouble();
		
		double calculo = (nro * nro);
		System.out.println("A área desse quadrado é: "+ calculo + "cm");
	}

}
