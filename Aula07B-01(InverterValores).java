/******************************************************************************
Escreva um programa para receber dois números inteiros em duas
variáveis.
Se o primeiro número for maior que o segundo número, trocar os valores
das variáveis para que o menor número esteja na primeira variável.
Mostre as duas variáveis e verifique se o resultado é o esperado.

Faça o teste unitário do programa pelo menos duas vezes.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int primeiraVariavel, segundaVariavel, temp;
		
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o valor para a prmeira variável: ");
		primeiraVariavel = ler.nextInt();
		System.out.print("Digite o valor para a segunda variável: ");
		segundaVariavel = ler.nextInt();
		if(primeiraVariavel > segundaVariavel){
		    temp = primeiraVariavel;
		    primeiraVariavel = segundaVariavel;
		    segundaVariavel = primeiraVariavel;
		    System.out.println("O valor da primeira é maior que a segunda, então invertendo:");
		    System.out.println("O valor da primeira variável é :" + primeiraVariavel);
		    System.out.println("O valor da segunda variável é : " + segundaVariavel);
		}
		else{
		    System.out.println("O valor da primeira é menor que a segunda, então NÃO há inversão:");
		    System.out.println("O valor da primeira variável é :" + primeiraVariavel);
		    System.out.println("O valor da segunda variável é : " + segundaVariavel);
		}
	}
}
