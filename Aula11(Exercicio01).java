/******************************************************************************
Escreva um programa para armazenar números em um vetor de 5 posições, considerando as seguintes regras:
- Só aceitar números positivos
- Não aceitar números duplicados

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int[] vetor = {0,0,0,0,0};
	    boolean repetido;
	    int numero;
	    
	    Scanner ler = new Scanner(System.in);
	    for(int i = 0; i < vetor.length; i++ ){
	        do{
	            System.out.print("Digite um número para a posição " + (i + 1) + ": (NÃO SERÃO ADMITIDOS NÚMEROS REPETIDOS E ÍMPARES) ");
	            numero = ler.nextInt();
	            repetido = false;
	            for(int j = 0; j < vetor.length; j++){
	                if(vetor[j] == numero){
	                    repetido = true;
	                }//end-if
	            }//end-for
	        }while((repetido == true) || (numero % 2 != 0));
	        vetor[i] = numero;
	    }//end-for
		
	}//end-void-main
}//end-Main
