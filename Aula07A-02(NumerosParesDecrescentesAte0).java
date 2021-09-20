/******************************************************************************
Escreva um programa para receber um número inteiro e mostrar
todos os números pares positivos do número digitado até 0.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int num;
		Scanner ler = new Scanner(System.in);
		do{
		    System.out.print("Digite um número para mostrar todos os pares dele até 0: ");
		    num = ler.nextInt();
		    if (num <= 0){
		        System.out.println("Digite um número positivo maior que 0.");
		    }
		}while(num <= 0);
		for(int i = num; i > 0; i = i - 1){
		    if( i % 2 == 0){
		        System.out.printf("%d ", i);    
		    }
		}
	}
}
