/******************************************************************************
Escreva um programa para conceder um aumento percentual de salário.
Mostrar o salario aumentado.
Entrada salário
Entrada percentual de aumento
Processamento:
Aumento salarial = salario * percentual de aumento / 100 Salario aumentado = salario + aumento salarial
Saída: Salario aumentado
Salario = 1000
Aumento salarial = 1000 * 10 / 100 => 100 Salario aumenta = 1000 + 100 = 1100
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	double salario, percentual, salarioFinal;
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Aumento Salárial");
	
	System.out.print("Digite o salário inicial: R$ ");
	salario = ler.nextDouble();
	System.out.print("\nDigite o aumento percentual(%):  ");
	percentual = ler.nextDouble();
	
	salarioFinal = salario + (salario * (percentual/100));
	System.out.printf("O salário final é: R$ %.2f", salarioFinal);
	}
}