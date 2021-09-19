/******************************************************************************
Escreva um programa para receber um número inteiro e mostrar se o
número recebido é par ou impar.

Dica: Todo número par quando dividido por 2 resta 0.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int num;
		
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		num = ler.nextInt();
		if (num % 2 == 0){
		    System.out.println("O número é PAR.");
		}
		else{
		    System.out.println("O número é ÍMPAR.");
		}
		ler.close();
	}
}
