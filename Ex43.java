//Escreva um programa de ajuda para vendedores. A partir de um valor total lido, mostre: 
// - O total a pagar com desconto de 10%
// - O valor de cada parcela, no parcelamento de 3x sem juros;
// - A comiss�o do vendedor, no caso da venda ser a vista (5% sobre o valor com desconto)
// - A comiss�o do vendedor, no caso da venda ser parcelada (5% sobre o valor total) 

package atividades;
import java.util.*;
public class Ex43 {

	public static void main(String[] args) {
		Scanner vl = new Scanner(System.in);
	     System.out.println("Informe o valor do produto: ");
	     double d = vl.nextDouble();
	     
	     //- O total a pagar com desconto de 10%
	     double desc1 = d - (d * 0.10);
	     System.out.println("O total a pagar com 10% de desconto �: " + desc1);

	     //- O valor de cada parcela, no parcelamento de 3x sem juros;
	     double parc = d / 3;
	     System.out.printf("O valor de cada parcela em 3x sem juros, ser� de: %.2f \n",parc);
	     
	     //- A comiss�o do vendedor, no caso da venda ser a vista (5% sobre o valor com desconto)
	     double comissao1 = (desc1 * 0.05);
	     System.out.printf("A comiss�o no caso de pgto � vista, ser� de: %.2f \n",comissao1);
	     
	     // - A comiss�o do vendedor, no caso da venda ser parcelada (5% sobre o valor total)
	     double comissao2 = (d * 0.05);
	     System.out.printf("A comiss�o no caso de pgto parcelado ser� de: %.2f ",comissao2);
	     
	}
	

}
