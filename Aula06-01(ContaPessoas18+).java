/******************************************************************************
Escreva um programa para receber
a idade de 5 pessoas e mostrar a quantidade de pessoas com 18 anos ou mais
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int idade, idade18, cont;
	    cont = 0;
	    idade18 = 0;
	    
	    Scanner ler = new Scanner(System.in);
	    while (cont < 5){
	        cont++;
	        System.out.printf("Digite a idade da %dº pessoa: ", cont);
	        idade = ler.nextInt();
	        if (idade >= 18){
	            idade18++;
	        }
	    }
	    System.out.printf("A quantidade de pessoas com mais de 18 anos é: %d.", idade18);
		ler.close();
	}
}
