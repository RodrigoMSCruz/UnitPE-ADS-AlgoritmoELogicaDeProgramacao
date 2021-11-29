/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int nCond;
		float taxa, taxaExtra, total;
		final float TAXA_ADICIONAL = 1.5f;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("\nDigite o número de condomínios a serem cobrados: ");
		nCond = ler.nextInt();
		System.out.print("\nDigite o valor da taxa de condomínio de um mês normal: ");
		taxa = ler.nextFloat();
		System.out.print("\nDigite o valor da taxa extra: ");
		taxaExtra = ler.nextFloat();
		
		total = nCond*((taxa*TAXA_ADICIONAL)+taxaExtra);
		System.out.println("O valor total a ser arrecadado é: R$ " + total + ".");
	}//static-void
}//Main
