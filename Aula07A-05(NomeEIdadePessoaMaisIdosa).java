/******************************************************************************
Escreva um programa para receber o nome e a idade de 4 pessoas e mostrar:
• o nome e a idade da pessoa mais idosa
Obs.: Considerar que não há pessoas com a mesma idade
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    String nome, nomeMaisIdoso;
	    int idade, idadeMaisIdosa;
	    nomeMaisIdoso = "";
	    idadeMaisIdosa = 0;
	    for(int i=1; i<=4; i++){
	        System.out.printf("Digite o nome da %d pessoa: ", i);
	        ler.nextLine();
	        nome = ler.nextLine();
	        System.out.printf("\nDigite a idade da % pessoa:", i);
	        ler.nextLine();
	        idade = ler.nextInt();
	        if(i == 1){
	            nomeMaisIdoso = nome;
	            idadeMaisIdosa = idade;
	        }
	        else{
	           if(idade > idadeMaisIdosa){
	               nomeMaisIdoso = nome;
	               idadeMaisIdosa = idade;
	           } 
	        }
	    }
	    System.out.printf("A pessoa mais idosa é: %d.", nomeMaisIdoso);
	    System.out.printf("\nE sua idade é: %d.", idadeMaisIdosa);
	}
}
