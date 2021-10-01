/******************************************************************************
Escreva um programa para:
1. Receber a placa e o valor de 6 veículos.
2. Para cada veículo informado, mostrar o mês de pagamento do IPVA de acordo
com a tabela a seguir.
3. No final mostrar o total arrecadado com IPVA, por mês e geral.

Final da placa      Mês do pagamento
1-3                     Janeiro
4-6                     Fevereiro
7-9                     Março
0                       Abril

Obs.:
• O valor do IPVA é 10% do valor do veículo.
• Considerar o modelo de placa tradicional de 7 posições (AAA9999)

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		String placa, finalPlaca;
		float totalJaneiro, totalFevereiro, totalMarco, totalAbril, totalGeral;
		float valor, ipva;
		totalJaneiro = totalFevereiro = totalMarco = totalAbril = totalGeral = 0;
		
		Scanner ler = new Scanner(System.in);
		
		for(int i = 1; i <= 2; i++){
		    
		    System.out.print("\nDigite o valor de seu veículo: ");
		    valor = ler.nextFloat();
		    ler.nextLine();
		    System.out.print("\nDigite a placa de seu veículo: ");
		    placa = ler.nextLine();
		    finalPlaca = placa.substring(6);
		    
		    ipva = valor * 0.1f;
		    if(finalPlaca.equals("1") || finalPlaca.equals("2") || finalPlaca.equals("3")){
		       System.out.println("O mês de pagamento de seu IPVA é janeiro e o valor é R$ " + ipva);
		       totalJaneiro = totalJaneiro + ipva;
		    }//end-if
		    if(finalPlaca.equals("4") || finalPlaca.equals("5") || finalPlaca.equals("6")){
		       System.out.println("O mês de pagamento de seu IPVA é fevereiro e o valor é R$ " + ipva);
		       totalFevereiro = totalFevereiro + ipva;
		    }//end-if
		    if(finalPlaca.equals("7") || finalPlaca.equals("8") || finalPlaca.equals("9")){
		       System.out.println("O mês de pagamento de seu IPVA é março e o valor é R$ " + ipva);
		       totalMarco = totalMarco + ipva;
		    }//end-if
		    if(finalPlaca.equals("0")){
		       System.out.println("O mês de pagamento de seu IPVA é abril e o valor é R$ " + ipva);
		       totalAbril = totalAbril + ipva;
		    }//end-if
		}//end-for
		totalGeral = totalJaneiro + totalFevereiro + totalMarco + totalAbril;
		System.out.println("");
		System.out.println("Total arrecadado em Janeiro: R$ " + totalJaneiro);
		System.out.println("Total arrecadado em Fevereiro: R$ " + totalFevereiro);
		System.out.println("Total arrecadado em Marco: R$ " + totalMarco);
		System.out.println("Total arrecadado em Abril: R$ " + totalAbril);
		System.out.println("Total geral arrecadado: R$ " + totalGeral);
	}//end-void-main
}//end-Main

