/******************************************************************************
1UP Questão Prática

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int pecaHora[] = new int[12];
		int producao, totalProducaoNormal, totalProducaoExtra, totalHorasExtras;
		
		double horaTrabalhada, salarioFinal;
		
		Scanner ler = new Scanner(System.in);
		
		totalProducaoNormal = totalProducaoExtra = totalHorasExtras = 0;
		
		for(int i = 0; i <= 7; i++){
		    while(true){
		        System.out.print("\nPara horas sem produção, digite -1");
		        System.out.print("\nDigite o nº de peças produzidas na " + (i + 1) +"ª hora NORMAL do dia: ");
		        producao = ler.nextInt();
		        if(producao == -1){
		            break;
		        }
		        if(producao >= 1){
		            break;
		        }//end-if
		        if(producao == 0 || producao < -1){
		            System.out.print("\nSó são aceitos -1(Para produção ZERO) e números maiores que ZERO");
		        }//end-if
		    }//end-while
		    pecaHora[i] = producao;
		}//end-for
		
		System.out.print("\nENTRADA PARA PRODUÇÃO DE PEÇAS NAS HORAS EXTRAS!");
		//Entrada da produção nas horas normais
		
		for(int i = 8; i <= 11; i++){
		    do{
		        System.out.print("\nPara horas extras sem produção, digite 0");
		        System.out.print("\nDigite o nº de peças produzidas na " + (i + 1) +"ª hora EXTRA do dia: ");
		        producao = ler.nextInt();
		        if(producao < 0){
		            System.out.print("\nSó são aceitos números maiores ou iguais a ZERO");
		        }//end-if
		    }while(producao < 0);
		    pecaHora[i] = producao;
		}//end-for
		
		//Entrada da produção nas horas extras
		for(int i = 0; i <= 7; i++){
		    if(pecaHora[i] != -1){
		        totalProducaoNormal = totalProducaoNormal + pecaHora[i];
		    }//end-if
		}//end-for
		System.out.print("");
		System.out.print("\nProdução diária nas horas normais: " + totalProducaoNormal + ".");
		
		//Cálculo do somatório da produção nas horas extras
		for(int i = 8; i <= 11; i++){
		    if(pecaHora[i] != 0){
		        totalProducaoExtra = totalProducaoExtra + pecaHora[i];
		        totalHorasExtras++;
		    }//end-if
		}//end-for
		System.out.print("\nProdução diária nas horas extras: " + totalProducaoExtra + ".");
		System.out.print("\nTotal de horas extras: " + totalHorasExtras + "h.");
		
		//Cálculo do salário final
		System.out.println("");
		System.out.print("\nEntre com o valor da hora de trabalho: ");
		horaTrabalhada = ler.nextDouble();
		salarioFinal = (horaTrabalhada * 8) + ((horaTrabalhada)/2 * totalHorasExtras); 
		System.out.print("\nO salário final é: R$ " + salarioFinal + "." );
		
	}//end-void-main
}//end-Main
