/******************************************************************************
Escreva um programa para:

• Receber a quantidade de alunos que farão a prova de segunda
chamada (pode ser que não haja aluno para fazer)

• Receber a nota de cada um dos alunos

• Mostrar no final a média geral das notas dos alunos

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int quantAlunos;
		float nota, totalNotas;
		
		totalNotas = 0f;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de alunos: ");
		quantAlunos = ler.nextInt();
		if(quantAlunos <= 0){
		    System.out.println("Não há alunos para fazer a 2ª chamada. Até mais!");
		}
		else{
		    for(int i = 1; i <= quantAlunos; i++){
		        System.out.printf("Digite a %dª nota: ", i);
		        ler.nextLine();
		        nota = ler.nextFloat();
		        totalNotas = totalNotas + nota;
		    }
		    System.out.printf("A média das %d notas é: %.1f", quantAlunos, totalNotas/quantAlunos);
		}
		ler.close();
	}
}