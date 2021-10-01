/******************************************************************************
Escreva um programa para receber a matricula (string) de um aluno e mostra o tipo de
curso que ele faz, de acordo com a seguinte tabela:
INICIO DA matricula     TIPO DE curso
1                       Técnico
2-4                     Graduação
5-6                     Lato Sensu
7-8                     Stricto Sensu

da matricula não seja um desse valores, mostrar “Matricula incorreta”.
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    String matricula, iniMatricula;
	    Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite a matrícula do aluno(a): ");
		matricula = ler.nextLine();
		iniMatricula = matricula.substring(0,1);
		if(iniMatricula.equals("1")){
		    System.out.println("O seu curso é Técnico.");
		}//end-if
		if(iniMatricula.equals("2") || iniMatricula.equals("3") || iniMatricula.equals("4")){
		    System.out.println("O seu curso é Graduação.");
		}//end-if
		if(iniMatricula.equals("5") || iniMatricula.equals("6")){
		    System.out.println("O seu curso é Lato Sensu.");
		}//end-if
		if(iniMatricula.equals("7") || iniMatricula.equals("8")){
		    System.out.println("O seu curso é Stricto Sensu.");
		}//end-if
		if(iniMatricula.equals("9") || iniMatricula.equals("0")){
		    System.out.println("Matrícula incorreta.");
		}//end-if
	}//end-void-main
}//end-Main
