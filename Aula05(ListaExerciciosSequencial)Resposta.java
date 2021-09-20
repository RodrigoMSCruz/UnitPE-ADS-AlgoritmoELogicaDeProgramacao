//Aula05-UNIT_2021.2_LP_Lista_Exercicios_Sequencial


//1)
/******************************************************************************
Problema: Conversão de hora para minutos e segundos  Requisito: A partir de uma determinada hora informada, mostrar:
• A hora em minutos • A hora em segundos
*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		int hora, minuto, segundo, resultMinutos, resultSegundos;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite a hora: ");
		hora = leia.nextInt();
		
		System.out.print("\nDigite o minuto: ");
		minuto = leia.nextInt();
		
		System.out.print("\nDigite o segundo: ");
		segundo = leia.nextInt();
		
		resultMinutos = (hora * 60) + minuto;
		System.out.println("O resultado em minutos é: " + resultMinutos + ".");
		
		resultSegundos = (hora * 60 * 60) + (minuto * 60) + segundo;
		System.out.println("O resultado em segundos é: " + resultSegundos + ".");
		leia.close();
	}
}

//2)
/******************************************************************************
Uma indústria de peças automotivas trabalha em 2 turnos. Diariamente o responsável de cada turno registra a quantidade de peças produzida em seu turno.  Elabore um programa para ler a quantidade de peças produzidas em cada turno de um dia e mostrar o total de peças produzidas no dia. 
******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		int pecasTurno1, pecasTurno2, totalPecas;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o total de pecas do primeiro turno: ");
		pecasTurno1 = leia.nextInt();
		
		System.out.print("\nDigite o total de pecas do segundo turno: ");
		pecasTurno2 = leia.nextInt();
		
		totalPecas = pecasTurno1 + pecasTurno2;
		System.out.println("\nO total de peças produzidas nos 2 turnos de hoje é: " + totalPecas +".");
		leia.close();
	}
}

//3)
/******************************************************************************
Problema:Umdeliveryqueoferecetiposdeprato(R$10,00eR$13,00)ecobraR$7,00detaxadeentrega, independente da quantidade de pratos. 
Requisito: Mostrar o valor da conta, considerando que o cliente pode pedir quantidades diferentes para cada tipo de prato. 
******************************************************************************/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		float qtdPrato1, qtdPrato2, total;
		final float VALOR_PRATO1 = 10.0f;
		final float VALOR_PRATO2 = 13.0f;
		final float TAXA = 7.00f;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de pratos do tipo 1 desejada: ");
		qtdPrato1 = leia.nextInt();
		
		System.out.print("\nDigite a quantidade de pratos do tipo 2 desejada: ");
		qtdPrato2 = leia.nextInt();
		
		total = (qtdPrato1 * VALOR_PRATO1) + (qtdPrato2 * VALOR_PRATO2) + TAXA;
		System.out.println("O total do pedido é: " + total +".");
		leia.close();
	}
}

//4)
/******************************************************************************
Problema: No mês de novembro é cobrado 1,5 vez (uma vez e meia)o valor da taxa de condomínio, para que seja pago o 13a salário de seus funcionários,
mais uma taxa extra para a festa de final de ano. A cobrança é realizada para cada imóvel do condomínio.  Requisito: Mostrar a previsão de arrecadação do condomínio no mês de novembro, considerando o valor de um mês convencional e o valor da taxa extra. 
******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		double taxaCondominio, taxaExtra, total;
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite o valor da taxa de um mês normal: ");
		taxaCondominio = leia.nextFloat();
		System.out.print("\nDigite o valor da taxa-extra: ");
		taxaExtra = leia.nextFloat();
		total = (taxaCondominio * 1.5) + taxaExtra;
		System.out.print("O valor total de Novembro será: " + total + ".");
		leia.close();
	}
}

//5)
/******************************************************************************
Um tapiocaria comercializa tapioca simples por R$ 5,00 e tapioca gourmet por R$ 8,00.  Elabore um programa que leia a quantidade de tapiocas vendidas de cada tipo e quanto gastou para comprar os ingredientes. Mostre: • Quantidade total de tapiocas vendidas • O valor apurado com as vendas de tapiocas simples  • O valor apurado com as vendas de tapiocas gourmet • O valor total bruto apurado com as vendas • O valor total líquido* aputado com as vendas  * Valor total líquido, descontar o valor gasto com ingredientes  ******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		final double TAPIOCA_SIMPLES = 5.00;
		final double TAPIOCA_GOURMET = 8.00;
		double qtdTapiocaSimples, qtdTapiocaGourmet;
		double valorIngredientesTapiocaSimples, valorIngredientesTapiocaGourmet;
		double valorTotalTapiocaSimples, valorTotalTapiocaGourmet;
		double qtdTotal, totalLiquido, totalBruto;
	    
		Scanner leia = new Scanner(System.in);
	    
		System.out.print("Digite a quantidade de tapioca simples vendidas: ");
		qtdTapiocaSimples = leia.nextDouble();
	    
		System.out.print("\nDigite o valor dos ingredientes da tapioca simples: ");
		valorIngredientesTapiocaSimples = leia.nextDouble();
	    
		System.out.print("\nDigite a quantidade de tapioca gourmet vendidas: ");
		qtdTapiocaGourmet = leia.nextDouble();
	    
		System.out.print("\nDigite o valor dos ingredientes da tapioca gourmet: ");
		valorIngredientesTapiocaGourmet = leia.nextDouble();
	    
		qtdTotal = qtdTapiocaSimples + qtdTapiocaGourmet;
	    
		valorTotalTapiocaSimples = qtdTapiocaSimples * TAPIOCA_SIMPLES;
		valorTotalTapiocaGourmet = qtdTapiocaGourmet * TAPIOCA_GOURMET;
	    
		totalBruto = valorTotalTapiocaSimples + valorTotalTapiocaGourmet;
		totalLiquido = totalBruto - valorIngredientesTapiocaSimples - valorIngredientesTapiocaGourmet;
	    
		System.out.println("Quantidade total de tapiocas vendidas: " + qtdTotal + ".");
		System.out.println("Valor apurado com as vendas de tapiocas simples: R$ " + valorTotalTapiocaSimples + ".");
		System.out.println("Valor apurado com as vendas de tapiocas gourmet: R$ " + valorTotalTapiocaGourmet + ".");
	    
		System.out.println("Valor total bruto apurado: " + totalBruto + ".");
		System.out.println("Valor total líquido apurado: " + totalLiquido + ".");
		leia.close();
	}
}
