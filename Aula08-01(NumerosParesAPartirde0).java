/******************************************************************************
Escreva um programa para receber
um número inteiro e mostrar todos os números pares positivos até o número
digitado.
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int numero;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		numero = ler.nextInt();
		System.out.println("Todos os números pares até o " + numero + " são:");
		for(int i = 0; i <= numero; i = i + 2){
		    System.out.print(i + " ");
		}
	}
}
