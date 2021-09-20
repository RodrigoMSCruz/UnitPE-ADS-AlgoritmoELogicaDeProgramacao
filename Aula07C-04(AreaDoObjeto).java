/******************************************************************************
Escreva um programa para conceder um aumento percentual de salário.
Mostrar o salario aumentado.
Entrada salário
Entrada percentual de aumento
Processamento:
A área do objeto abaixo pode ser determinada pela metade da área de um círculo
mais a metade da área de um quadrado. Escreva um algoritmo para receber o lado
do quadrado e mostrar a área do objeto.
 *******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	double lado, raio, area;
	final double PI = 3.14; 
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Cálculo de área.");
	System.out.print("\nDigite o comprimento do lado: ");
	lado = ler.nextDouble();
	raio = lado/2;
	area = (lado * lado) + (PI * raio * raio);
	System.out.printf("A área da figura geométrica é: %.2f.", area);
	}
}