/******************************************************************************
Escreva um programa para receber o preço de um produto e informar as opções de
pagamento com seus respectivos valores.
Preço do produto R$: 150,00
Opções de pagamento
A vista com desconto de 10% R$: 135,00
3 x de R$ 50,00
Total de R$: 150,00
 *******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        double preco, precoComDesconto, preco3X;
        final double DESCONTO_A_VISTA = 0.1;
        
    	Scanner ler = new Scanner(System.in);
    	
    	System.out.print("Preço do produto: R$: ");
    	preco = ler.nextFloat();
    	
    	precoComDesconto = preco - (preco * DESCONTO_A_VISTA);
        preco3X = preco/3;
        System.out.println("Opções de pagamento");
        System.out.print("\nÀ vista com desconto de 10%: R$ " + precoComDesconto + ".");
        System.out.print("\n3 x de R$ " + preco3X + ".");
        System.out.print("\nTotal de R$ %." + preco + ".");
	}
}