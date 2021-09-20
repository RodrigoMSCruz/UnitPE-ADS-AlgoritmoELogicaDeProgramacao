/******************************************************************************
Elabore um programa para ler dois números (dividendo e divisor), calcule a divisão e mostre o resultado.

Obs.: Se o divisor for zero a divisão não pode ocorrer e deverá ser mostrado “Impossível divisão por 0”.
*******************************************************************************/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		float dividendo, divisor, resultado;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o valor do dividendo: ");
		dividendo = ler.nextFloat();
		
		System.out.print("Digite o valor do divisor: ");
		divisor = ler.nextFloat();
		
		if (divisor == 0){
		    System.out.println("ERRO! Não é possível fazer divisão por ZERO.");
		}
		else{
		    resultado = dividendo / divisor;
		    System.out.println("O resultado é: " + resultado);
		}
		ler.close();
	}
}
