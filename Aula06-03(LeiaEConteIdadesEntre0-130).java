/******************************************************************************
Escreva um programa para receber
a idade de 5 pessoas e mostrar a quantidade de pessoas com 18 anos ou mais.
Crítica: Não aceitar idade negativa nem idade maior que 130 anos 
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int idade, qPessoas18Mais;
	    
	    qPessoas18Mais = 0;
	    Scanner ler = new Scanner(System.in);
	    
	    for(int i = 1; i <=5; i++){
	        do{
	            System.out.printf("Digite a idade da pessoa %d: ", i);
	            idade = ler.nextInt();
	            if(idade < 0 || idade > 130){
	                System.out.println("ERRO: Só são aceitas idades entre 0 e 130 anos!");
	            }
	            else{
	                if(idade >= 18){
	                    qPessoas18Mais++;    
	                }
	            }
	        }while((idade < 0 || idade > 130));
	    }
	    System.out.printf("A quantidade de pessoas com 18 anos ou mais é %d.", qPessoas18Mais);
    }
}