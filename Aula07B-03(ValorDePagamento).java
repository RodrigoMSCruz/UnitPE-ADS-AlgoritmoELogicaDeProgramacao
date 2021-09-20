/******************************************************************************
A escola de natação Nado a Jato precisa alterar o seu sistema de cobrança para
calcular o valor dos juros das parcelas em atraso. O valor dos juros é cobrado
conforme os dias de atraso, obedecendo a tabela abaixo:
dias        % de juros
Até 30          5
De 31 a 60      10
Acima de 60     15

Elabore um programa para receber os dados necessários, calcular e mostrar o
valor dos juros e o valor do pagamento.
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    double valor, valorFinal;
	    int diasAtraso;
	    char resposta;
	    
	    valorFinal = 0d;
	    Scanner ler = new Scanner(System.in);
	        System.out.print("Digite o valor da parcela: ");
	        valor = ler.nextDouble();
	        System.out.print("\nDigite o período de atraso da parcela em dias: ");
	        diasAtraso = ler.nextInt();
	        
	        if(diasAtraso <= 30){
	            valorFinal = valor + (valor * 0.05);    
	        }
	        if(diasAtraso > 30 && diasAtraso <= 60){
	            valorFinal = valor + (valor * 0.1);
	        }
	        if(diasAtraso > 60){
	            valorFinal = valor + (valor * 0.15);
	        }
	        System.out.printf("O valor final é %.2f.", valorFinal);
	}
}
