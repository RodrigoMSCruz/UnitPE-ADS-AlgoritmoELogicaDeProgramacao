/******************************************************************************
Escreva um programa para receber
um número inteiro e mostrar todos os números pares positivos até o número
digitado.
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int primeiro, ultimo;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro inicial: ");
		primeiro = ler.nextInt();
		
		System.out.print("Digite um número inteiro final: ");
		ultimo = ler.nextInt();
		
		System.out.println("Todos os números pares de " + primeiro + " até " + ultimo + " são:");
		for(int i = primeiro; i <= ultimo; i++){
		    if(i % 2 == 0){
		        System.out.print(i + " ");
		    }
		}
	}
}
