/******************************************************************************
O álcool gel passou a ser subsidiado pelo governo e nenhum estabelecimento poderá
vender o produto por preço igual ou superior ao preço praticado em dezembro/2019.

Elabore um programa para ler o preço atual e o preço praticado em dezembro/2019
e mostrar “Venda não pode ser realizada – Preço superfaturado”, se o preço atual
for equivalente ou ultrapassar o preço praticado em dezembro/2019.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		float precoAtual, precoPraticado;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o valor do álcool em gel estimado pelo governo em Dez/2019: R$ ");
		precoPraticado = ler.nextFloat();
		
		System.out.print("\nDigite o valor do álcool em gel atual: R$ ");
		precoAtual = ler.nextFloat();
		
		if (precoAtual >= precoPraticado){
		    System.out.println("Venda não pode ser realizada – Preço superfaturado");
		}
		ler.close();
	}
}
