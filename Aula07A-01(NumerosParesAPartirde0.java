/******************************************************************************
Escreva um programa para receber um número inteiro e mostrar
todos os números pares positivos até o número digitado.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int num;
		Scanner ler = new Scanner(System.in);
		do{
		    System.out.print("Digite um número para mostrar todos os pares até ele: ");
		    num = ler.nextInt();
		    if (num <= 0){
		        System.out.println("Digite um número positivo maior que 0.");
		    }
		}while(num <= 0);
		for(int i = 0; i <= num; i = i +2){
		    System.out.printf("%d ", i);
		}
	}
}
