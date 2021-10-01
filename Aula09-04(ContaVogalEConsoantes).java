/******************************************************************************
Escreva um programa para receber 6 nomes e mostrar quantos começam com
vogal e quantos começam com consoante.

Obs.: Considerar que na primeira posição do nome tem sempre uma letra.
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    String nome, l1Nome;
	    int cVogal, cConsoante;
	    cVogal = cConsoante = 0;
	    Scanner ler = new Scanner(System.in);
		
		for(int i = 1; i <= 6; i++){
		    System.out.print("\nDigite o " + i + "º nome: ");
		    nome = ler.nextLine();
		    nome = nome.toUpperCase();
		    l1Nome = nome.substring(0,1);
		    
		    if(l1Nome.equals("A") || l1Nome.equals("E") || l1Nome.equals("I") || l1Nome.equals("O") || l1Nome.equals("U")){
		        cVogal++;
		    }//end-if
		    else{
		        cConsoante++;
		    }//end-else
		}//end-for
		System.out.println("O número de nomes que começa com vogal é: " + cVogal);
		System.out.println("O número de nomes que começa com consoante é: " + cConsoante);
	}//end-void-main
}//end-Main
