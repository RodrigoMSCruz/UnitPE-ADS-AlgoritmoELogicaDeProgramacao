/******************************************************************************
Escreva um programa que armazene 6 nomes de pessoas em um array.
Depois de armazenar os nomes, receba outro nome para procurar no array.
Informar, conforme o caso, uma das mensagens abaixo:
Nome encontrado na Xª posição
Nome não encontrado
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    String[] nomes = new String[6];
	    String nomeProcura;
	    int posicao;
	    
	    posicao = -1;
	    Scanner ler = new Scanner(System.in);
	    
	    for(int i = 0; i < nomes.length; i++){
	        System.out.print("\nDigite o nome da pessoa " + (i + 1) + ": ");
	        nomes[i] = ler.nextLine();
	        nomes[i].toUpperCase();
	    }//end-for
	    
	    System.out.print("\nDigite um nome para pesquisar: ");
	    nomeProcura = ler.nextLine();
	    nomeProcura.toUpperCase();
	    
	    for(int i = 1; i < nomes.length; i++){
	       if(nomes[i].equals(nomeProcura)){
	            posicao = i;
	        }//end-if
	    }//end-for
	    
	    if(posicao == -1){
	        System.out.println("Nome não encontrado.");
	    }
	    else{
	        System.out.println("Nome encontrado na " + (posicao+1) +"ª posição.");
	    }
	}//end-void-main
}//end-Main
