/******************************************************************************
Escreva um programa para receber a idade de 6 alunos.
Se a
idade do aluno menor que 15 anos, informar que o aluno NÃO PODE SE MATRICULAR;
Se a
idade do aluno for maior ou igual a 15 anos e menor que 21 anos, informar que o
aluno só poderá se matricular com o
responsável e receber o nome do responsável;
Se a
idade for igual ou maior que 21 anos, informar PODE
SE MATRICULAR.
No
final mostrar:
O percentual de matriculas rejeitadas
A quantidade de matriculas realizadas com responsáveis
A quantidade total de matriculas realizadas
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int idade, contNaoMat, contMatComResp, contMatOK;
		double perContNaoMat;
		contNaoMat = contMatComResp = contMatOK = 0;
		String nomeResp;
		
		Scanner ler = new Scanner(System.in);
		
		for(int i = 1; i <= 6; i++){
		    System.out.print("Digite a idade do aluno: ");
		    idade = ler.nextInt();
		    if(idade < 15){
		        contNaoMat++;
		        System.out.println("NÃO PODE SE MATRICULAR!");
		    }
		    if((idade >= 15) && (idade < 21)){
		        contMatComResp++;
		        System.out.println("O ALUNO SÓ PODE SE MATRICULAR COM O RESPONSÁVEL!");
		        ler.nextLine();
		        System.out.print("Nome do responsável: ");
		        nomeResp = ler.nextLine();
		    }
		    if(idade >= 21){
		        contMatOK++;
		        System.out.println("O ALUNO PODE SE MATRICULAR.");
		    }
	    }
	    perContNaoMat = (contNaoMat / 6.0d) * 100.0d;
	    
	    System.out.printf("O percentual de matrículas rejeitadas é: %.2f", perContNaoMat);
	    System.out.print("\nA quantidade de matrículas realizadas com responsáveis foi: " + contMatComResp + ".");
	    System.out.print("\nA quantidade de matrículas realizadas foi: " + contMatOK + ".");
	}
}
