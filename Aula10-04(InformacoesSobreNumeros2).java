/******************************************************************************
Considere um array carregado com 10 números inteiros positivos ou negativos.
•Informar se tem mais números pares, mais números impares ou iguais
•Informar se tem mais números positivos ou números negativos ou iguais

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int[] numeros = new int[10];
		int contPares, contImpares, contPositivo, contNegativo;
		contPares = contImpares = contPositivo = contNegativo = 0;
		
		Scanner ler = new Scanner(System.in);
		
		for(int i = 0; i < numeros.length; i++){
		    System.out.print("\nDigite o " + (i + 1) + "º número do array: ");
		    numeros[i] = ler.nextInt();
		}//end-for
		for(int i = 0; i < numeros.length; i++){
		    if(numeros[i] % 2 == 0){
		        contPares++;
		    }//end-if
		    else{
		        contImpares++;
		    }//end-else
		    if(numeros[i] >= 0){
		        contPositivo++;
		    }//end-if
		    else{
		        contNegativo++;
		    }//end-else
		}//end-for
		if(contPositivo > contNegativo){
		    System.out.println("A maioria dos números é positiva. Quantidade: " + contPositivo + ".");    
		}//end-if
		if(contPositivo < contNegativo){
		    System.out.println("A maioria dos números é negativa. Quantidade: " + contNegativo + ".");    
		}//end-if
		if(contPositivo == contNegativo){
		    System.out.println("A quantidade de números é positiva e negativa são iguais. Quantidade: " + contPositivo + ".");    
		}//end-if
		if(contPares > contImpares){
		    System.out.println("A maioria dos números é par. Quantidade: " + contPares + ".");   
		}//end-if
		if(contPares < contImpares){
		    System.out.println("A maioria dos números é ímpar. Quantidade: " + contImpares + ".");   
		}//end-if
		if(contPares == contImpares){
		    System.out.println("A quantidade de números é pares e ímpares são iguais. Quantidade: " + contPares + ".");  
		}//end-if
	}//end-voidMain
}//end-Main
