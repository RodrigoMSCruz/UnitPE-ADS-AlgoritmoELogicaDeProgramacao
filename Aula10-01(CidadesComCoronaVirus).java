/******************************************************************************
Escreva um programa para receber a quantidade de pessoas contraminadas com o corona vírus nas 5 cidades principais
cidades de um estado. Ao final mostrar quantas cidades tiveram pessoas contaminadas iguais ou superiores a média geral
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int[] nContaminadosPorCidades = new int[5];
	    int total, acimaDaMedia;
	    float media;
	    
	    total = acimaDaMedia = 0;
	    
	    Scanner ler = new Scanner(System.in);
		for(int i = 0; i < nContaminadosPorCidades.length; i++){
		    System.out.print("Digite o número de pessoas contaminadas por corona vírus na cidade " + (i + 1) + ": ");
		    nContaminadosPorCidades[i] = ler.nextInt();
		    total = total + nContaminadosPorCidades[i];
		}//end-for
		
		media = total / nContaminadosPorCidades.length;
		
		System.out.print("\nA média de contaminados é: " + media + ".");
		
		for(int i = 0; i < nContaminadosPorCidades.length; i++){
		    if (nContaminadosPorCidades[i] >= media){
		        acimaDaMedia++;
		    }//end-if
		}//end-for
		
		System.out.println("\n" + acimaDaMedia + " cidades estão acima da média.");
	}//end-void-main
}//end-Main
