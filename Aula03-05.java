/******************************************************************************
Um buffet
deseja saber o valor que deverá cobrar para realizar o evento, tendo informado
que cobra um valor por convidado baseado no valor por pessoa do cardápio
escolhido, mais uma taxa de deslocamento de R$ 3,00 com base na distância em
quilômetros para onde o evento será realizado. 
Identifique os dados necessários para resolução deste problema e implemente um programa
para receber os dados, processar os cálculos e mostrar o valor total que deverá cobrar
para realizar o evento.
*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner leia = new Scanner(System.in);
	    float valorTotal, valorCardapio, quantPessoas, distancia;
	    final int taxaKm = 3;
	    
	    System.out.print("Digite a quantidade de pessoas do evento: ");
	    quantPessoas = leia.nextInt();
	    System.out.print("\nDigite o valor do cardapio: ");
	    valorCardapio = leia.nextFloat();
	    System.out.print("\nDigite a distância em km a ser percorrida: ");
	    distancia = leia.nextFloat();
	    valorTotal = (valorCardapio * quantPessoas) + (distancia * taxaKm);
	    System.out.println("O total do evento é: R$ " + valorTotal + ".");
	    leia.close();
	}
}
