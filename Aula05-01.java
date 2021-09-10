/******************************************************************************
Escreva um programa que receba, via teclado, o valor da locação e os dias de atraso
de um determinado livro e mostre o valor total da multa a ser paga.

Se tiver atraso, é cobrado R$ 1,50 por dia de atraso.
*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		float valorLocacao, valorTotal;
		int diasAtraso;
		final float TAXA_ATRASO = 1.5f;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o valor do da locação: ");
		valorLocacao = ler.nextFloat();
		
		System.out.print("\nDigite os dias de atraso: ");
		diasAtraso = ler.nextInt();
		if (diasAtraso > 0){ 
		    valorTotal = (diasAtraso * TAXA_ATRASO);
		    System.out.println("O valor total com MULTA é: " + valorTotal);    
		}
		else {
		    System.out.println("Não há multa a pagar.");
		}
		ler.close();
	}
}