/******************************************************************************
Escreva um programa para receber a placa e o valor de 6 veículos e
informar o mês de pagamento do IPVA de cada veículo.

TABELA DE PAGAMENTO

Final da Placa - Mês de PAGAMENTO
1-3 - Janeiro
4-6 - Fevereiro
7-9 - Marco
0 - Abril

No final mostrar o total arrecadado com IPVA, por mês e o total geral.
Obs.: O valor do IPVA é 10% do valor do veículo

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		double totalJaneiro, totalFevereiro, totalMarco, totalAbril, valor, totalGeral;
		int finalPlaca;
		
		totalJaneiro = 0;
		totalFevereiro = 0;
		totalMarco = 0;
		totalAbril =0;
		
		Scanner ler = new Scanner(System.in);
		for(int i = 1; i <= 6; i++){
		    System.out.printf("Digite o final da placa do %dº carro: ", i);
		    //ler.nextLine();
		    finalPlaca = ler.nextInt();
		    System.out.printf("Digite o valor do %dº carro: ", i);
		    //ler.nextLine();
		    valor = ler.nextDouble();
		    if (finalPlaca == 1 || finalPlaca == 2 || finalPlaca == 3){
		        totalJaneiro = totalJaneiro + valor;
		    }
		    if (finalPlaca == 4 || finalPlaca == 5 || finalPlaca == 6){
		        totalFevereiro = totalFevereiro + valor;
		    }
		    if (finalPlaca == 7 || finalPlaca == 8 || finalPlaca == 9){
		        totalMarco = totalMarco + valor;
		    }
		    if (finalPlaca == 0){
		        totalAbril = totalAbril + valor;
		    }
		}
		System.out.printf("Total arrecadado em Janeiro: %.2f", totalJaneiro);
		System.out.printf("\nTotal arrecadado em Fevereiro: %.2f", totalFevereiro);
		System.out.printf("\nTotal arrecadado em Março: %.2f", totalMarco);
		System.out.printf("\nTotal arrecadado em Abril: %.2f", totalAbril);
		totalGeral = totalJaneiro + totalFevereiro + totalMarco + totalAbril;
	    System.out.printf("\nTotal apurado: %.2f", totalGeral);
	    }
}
