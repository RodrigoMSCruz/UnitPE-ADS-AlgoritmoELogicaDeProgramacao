/******************************************************************************
Escreva um programa que armazene 6 nomes de pessoas em um array.
Depois de armazenar os nomes, receba outro nome para procurar no array.
Informar, quantas vezes o nome procurado ocorre no array
Se o nome não for encontrado mostrar a mensagem “Nome não encontrado”.
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    String[] nomes = new String[6];
	    String nomeProcura;
	    int repetido;
	    
	    repetido = 0;
	    Scanner ler = new Scanner(System.in);
	    
	    for(int i = 0; i < nomes.length; i++){
	        System.out.print("\nDigite o nome da pessoa " + (i + 1) + ": ");
	        nomes[i] = ler.nextLine();
	        nomes[i].toUpperCase();
	    }//end-for
	    
	    System.out.print("\nDigite um nome para pesquisar: ");
	    nomeProcura = ler.nextLine();
	    nomeProcura.toUpperCase();
	    
	    for(int i = 0; i < nomes.length; i++){
	       if(nomes[i].equals(nomeProcura)){
	            repetido++;
	        }//end-if
	    }//end-for
	    
	    if(repetido == 0){
	        System.out.println("Nome não encontrado.");
	    }//end-if
	    else{
	        System.out.println("Nome encontrado " + (repetido) +" vezes.");
	    }//end-else
	}//end-void-main
}//end-Main
