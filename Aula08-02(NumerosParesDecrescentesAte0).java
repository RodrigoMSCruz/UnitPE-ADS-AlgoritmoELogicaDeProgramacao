/******************************************************************************
Escreva
um programa para receber um número inteiro e mostrar todos os números pares
positivos do número digitado até 0.
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int numero;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		numero = ler.nextInt();
		System.out.println("Todos os números pares de " + numero + " até 0 são:");
		for(int i = numero; i >= 0; i = i - 1){
		    if(i % 2 == 0){
		        System.out.print(i + " ");
		    }
		}
	}
}
