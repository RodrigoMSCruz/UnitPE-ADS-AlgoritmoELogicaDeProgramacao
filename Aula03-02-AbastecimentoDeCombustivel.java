//Um abastecimento de combustível foi realizado em três bombas (parte em gasolina, parte em etanol e parte em GNV).


//Elabore um programa que leia os valores abastecidos de cada tipo de combustível e mostre o valor total do abastecimento.

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner lerTeclado = new Scanner(System.in);
	    float cGasolina, cEtanol, cGnv, total;
        
        System.out.print("Digite a quantidade de l de gasolina: ");
        cGasolina = lerTeclado.nextFloat();
        
        System.out.print("\nDigite a quantidade de l de etanol: ");
        cEtanol = lerTeclado.nextFloat();
        
        System.out.print("\nDigite a quantidade de m3 de GNV: ");
        cGnv = lerTeclado.nextFloat();
        
        total = cGasolina + cEtanol + cGnv;
        System.out.println("A quantidade de combustível abastecida foi: " + total + ".");
	}
}
