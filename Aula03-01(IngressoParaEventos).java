//Os ingressos para um evento foram classificados em 3 grupos: Normal, estudante e acessível.

//Elabore um programa para ler a quantidade de ingressos vendidos para cada um dos grupos e mostre o público total.

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner lerTeclado = new Scanner(System.in);
	    int cNormal, cEstudante, cAcessivel, total;
        
        System.out.print("Digite a quantidade de ingressos NORMAL: ");
        cNormal = lerTeclado.nextInt();
        System.out.print("\nDigite a quantidade de ingressos ESTUDANTE: ");
        cEstudante = lerTeclado.nextInt();
        System.out.print("\nDigite a quantidade de ingressos ACESSIVEL: ");
        cAcessivel = lerTeclado.nextInt();
        total = cNormal + cEstudante + cAcessivel;
        System.out.println("A quantidade de pessoas total é: " + total + ".");
	}
}