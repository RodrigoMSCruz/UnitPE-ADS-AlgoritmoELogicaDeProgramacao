/******************************************************************************
Escreva um programa para receber quantos dias e horas durou uma viagem e mostrar a duração da viagem em horas.
Duração da viagem
Quantos Dias : 2
Quantas Horas: 8
2 * 24 + 8 = 56
Total de horas: 56

ENTRAR COM DIAS
ENTRAR COM HORAS
CALCULAR DURACAO DA VIAGEM EM DIAS = DIAS * 24 + HORAS MOSTRAR DURACAO DA VIAGEM EM DIAS
 
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int duracaoDias, duracaoHoras, totalEmHoras;
	    Scanner ler = new Scanner(System.in);
	    System.out.print("Digite a duração em DIAS da viagem: ");
	    duracaoDias = ler.nextInt();
	    System.out.print("\nDigite a duração em HORAS da viagem: ");
	    duracaoHoras = ler.nextInt();
	    totalEmHoras = (duracaoDias * 24) + duracaoHoras;
	    System.out.printf("Total de horas: %d.", totalEmHoras);
	}
}
