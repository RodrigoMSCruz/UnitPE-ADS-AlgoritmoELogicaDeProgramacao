/******************************************************************************
SIMULADO
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int qDia[] = new int[7];
		int quantidade, dia, quantidadeFinalDeSemana, quantidadeDiasUteis;
		final double TARIFA_A = 3.50d;
	    final double TARIFA_B = 4.50d;
		
		quantidadeFinalDeSemana = quantidadeDiasUteis = 0;
		
		Scanner ler = new Scanner(System.in);
		
		for(int i = 0; i < 7; i++){
		    do{
		        System.out.print("Digite a quantidade de passageiros para o dia " + (i + 1) + ": ");
		        quantidade = ler.nextInt();
		        if(quantidade < 0){
		            System.out.print("\nAPENAS NÚMEROS POSITIVOS SÃO ACEITOS!\n");
		        }
		    }while(quantidade < 0);
		    qDia[i] = quantidade;
		}//end-for
		
		do{
		    System.out.print("\nDigite o dia da semana (1 - 7) para mais detalhes: ");
		    dia = ler.nextInt();
		    if(dia < 1 || dia > 7){
		        System.out.print("\nAPENAS NÚMEROS DE 1 A 7 SERÃO ACEITOS!\n");
		    }//end-if
		}while(dia < 1 || dia > 7);
		
		dia--;
		System.out.println("Quantidade de pagantes da tarifa A: " + (qDia[dia] * 0.6));
		System.out.println("Quantidade de pagantes da tarifa B: " + (qDia[dia] * 0.4));
		System.out.println("Apurado estimado - Tarifa A: R$ " + (qDia[dia] * 0.6 * TARIFA_A));
		System.out.println("Apurado estimado - Tarifa B: R$ " + (qDia[dia] * 0.4 * TARIFA_B));
		System.out.println("");
		
		quantidadeFinalDeSemana = qDia[0] + qDia[6];
		System.out.println("Quantidade de usuários no final de semana: " + quantidadeFinalDeSemana);
		System.out.println("");
		
		for(int i = 1; i < 6; i++){
		    quantidadeDiasUteis = quantidadeDiasUteis + qDia[i];
		}//end-for
		System.out.println("Quantidade de usuários nos dias úteis: " + quantidadeDiasUteis);
		
	}//end-void-main
}//end-Main
