/******************************************************************************
Escreva um programa para calcular a área do retângulo.
Entrada base
Entrada altura
Processamento: área do retângulo = base x altura Saída: área do retângulo
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		double base, altura, area;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Cálculo de área do retângulo.");
		System.out.print("Digite o comprimento a base: ");
		base = ler.nextDouble();
		
		System.out.print("\nDigite a altura: ");
		altura = ler.nextDouble();
		
		area = base * altura;
		System.out.printf("A área do retângulo é: %.2f.", area);
	}
}