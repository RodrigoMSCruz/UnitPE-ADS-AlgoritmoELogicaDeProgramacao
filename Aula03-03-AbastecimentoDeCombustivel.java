//Um abastecimento de combustível foi realizado em três bombas (parte em gasolina, parte em etanol e parte em GNV*). O posto cobra R$ 4,199 por litro de gasolina, R$ 3,009 por litro de etanol e R$ 1,259 por metro cúbico do GNV.

//Elabore um programa que leia a quantidade de litros abastecidos de cada tipo de combustível e mostre o valor do abastecimento de  cada tipo de combustível.

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner lerTeclado = new Scanner(System.in);
	    float cGasolina, cEtanol, cGnv, ptGasolina, ptEtanol, ptGnv, total;
	    final float PGasolina = 4.199f;
	    final float PEtanol = 3.009f;
	    final float PGnv = 1.259f;
        
        System.out.print("Digite a quantidade de l de gasolina: ");
        cGasolina = lerTeclado.nextFloat();
        ptGasolina = cGasolina * PGasolina;
        
        System.out.print("\nDigite a quantidade de l de etanol: ");
        cEtanol = lerTeclado.nextFloat();
        ptEtanol = cEtanol * PEtanol;
        
        System.out.print("\nDigite a quantidade de l de GNV: ");
        cGnv = lerTeclado.nextFloat();
        ptGnv = cGnv * PGnv;
        
        total = cGasolina + cEtanol + cGnv;
        
        System.out.println("A quantidade de combustível abastecida foi: " + total + " l.");
        System.out.println("O total em gasolina foi: R$ " + ptGasolina);
        System.out.println("O total em etanol foi: R$ " + ptEtanol);
        System.out.println("O total em GNV foi: R$ " + ptGnv);
	}
}
