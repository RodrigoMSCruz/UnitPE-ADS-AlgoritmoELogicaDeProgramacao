//Os ingressos para um evento foram classificados em 3 grupos: Normal R$ 100,00, estudante R$ 50,00 e acessível R$ 30,00.

//Elabore um programa para ler a quantidade de ingressos vendidos para cada um dos grupos e mostre o valor total das vendas de ingressos.

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner lerTeclado = new Scanner(System.in);
	    int cNormal, cEstudante, cAcessivel;
	    float total;
	    final float PNormal = 100.0f;
	    final float PEstudante = 50.0f;
	    final float PAcessivel = 30.0f;
        
        System.out.print("Digite a quantidade de ingressos NORMAL: ");
        cNormal = lerTeclado.nextInt();
        
        System.out.print("\nDigite a quantidade de ingressos ESTUDANTE: ");
        cEstudante = lerTeclado.nextInt();
        
        System.out.print("\nDigite a quantidade de ingressos ACESSIVEL: ");
        cAcessivel = lerTeclado.nextInt();
        
        total = (cNormal * PNormal) + (cEstudante * PEstudante) + (cAcessivel * PAcessivel);
        System.out.println("O Total apurado é: R$ " + total + ".");
	}
}

