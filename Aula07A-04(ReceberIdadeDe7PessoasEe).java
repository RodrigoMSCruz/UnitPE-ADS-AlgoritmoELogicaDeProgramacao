/******************************************************************************
Escreva um programa para receber a idade de 7 pessoas e mostrar:
• a quantidade de pessoas com 18 anos ou mais
• a idade da pessoa mais idosa
• a idade da pessoa mais nova
• a idade média
• a quantidade de pessoas com idade igual a maior idade

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int idade, quantIdade18Mais, idadeMaisIdosa, idadeMaisNova, somaIdade;
		int quantIgualMaiorIdade;
		double mediaIdade;
		
		quantIdade18Mais = 0; 
		idadeMaisIdosa = 0;
		idadeMaisNova = 0; 
		somaIdade = 0; 
		quantIgualMaiorIdade = 0;
		
		Scanner ler = new Scanner(System.in);
		
		for(int i = 1; i <= 7; i++){
		    System.out.printf("Digite a idade da %dº pessoa: ", i);
		    idade = ler.nextInt();
		    if(i == 1){
		        if(idade >= 18){
		            quantIdade18Mais++;
		        }
		        idadeMaisIdosa = idade;
		        idadeMaisNova = idade;
		        somaIdade = idade;
		    }
		    else{
		        if(idade >= 18){
		            quantIdade18Mais++;
		        }
		        if(idade > idadeMaisIdosa){
		            idadeMaisIdosa = idade;
		        }
		        if(idade < idadeMaisNova){
		            idadeMaisNova = idade;
		        }
		        somaIdade = somaIdade + idade;
		        if(idade == idadeMaisIdosa){
		            quantIgualMaiorIdade++;
		        }
		    }
		}
		System.out.printf("A quantidade de pessoas com 18 anos ou mais é: %d.", quantIdade18Mais);
		System.out.printf("\nA maior idade digitada é: %d.", idadeMaisIdosa);
		System.out.printf("\nA menor idade digitada é: %d.", idadeMaisNova);
		System.out.printf("\nA média de idade: %d.", somaIdade / 7);
		System.out.printf("\nA quantidade de pessoas com idade igual a %d é: %d", idadeMaisIdosa, quantIgualMaiorIdade);
	}	
}
