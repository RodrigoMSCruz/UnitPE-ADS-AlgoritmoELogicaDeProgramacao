/******************************************************************************
Escreva um programa para receber a idade e o sexo de 4 pessoas.
No final mostrar:
Quantidade de pessoas do sexo feminino
Quantidade de pessoas do sexo masculino
Idade média das pessoas do sexo feminino
Idade média das pessoas do sexo masculino
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int qPessoasSexoF, qPessoasSexoM, somaPessoasSexoF, somaPessoasSexoM;
	    float mediaPessoasSexoF, mediaPessoasSexoM;
	    int cont;
	    char sexo;
	    int idade;
	    
	    qPessoasSexoF = qPessoasSexoM = somaPessoasSexoF = somaPessoasSexoM = 0;
	    cont = 0;
	    
	    Scanner ler = new Scanner(System.in);
	    
	    while(cont < 4){
	        cont++;
	        System.out.print("Digite o sexo da pessoa (M/F): ");
	        sexo = ler.nextLine().charAt(0);
	        sexo = Character.toUpperCase(sexo);
	        System.out.print("\nDigite a idade da pessoa: ");
	        idade = ler.nextInt();
	        
	        if (sexo == 'F'){
	            qPessoasSexoF++;
	            somaPessoasSexoF = somaPessoasSexoF + idade;
	       }
	       else{
	            qPessoasSexoM++;
	            somaPessoasSexoM = somaPessoasSexoM + idade;
	       }
	    }
	    mediaPessoasSexoF = somaPessoasSexoF / qPessoasSexoF;
	    mediaPessoasSexoM = somaPessoasSexoM / qPessoasSexoM;
	    System.out.printf("\nA quantidade de mulheres foi %d e sua média de idade foi %.2f", qPessoasSexoF, mediaPessoasSexoF);
	    System.out.printf("\nA quantidade de homens foi %d e sua média de idade foi %.2f", qPessoasSexoM, mediaPessoasSexoM);
	}
}
