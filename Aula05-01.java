import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		float valorLocacao, valorTotal;
		int diasAtraso;
		final float TAXA_ATRASO = 1.5f;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o valor do da locação: ");
		valorLocacao = ler.nextFloat();
		
		System.out.print("\nDigite os dias de atraso: ");
		diasAtraso = ler.nextInt();
		if (diasAtraso > 0){ 
		    valorTotal = (diasAtraso * TAXA_ATRASO);
		    System.out.println("O valor total com MULTA é: " + valorTotal);    
		}
		else {
		    System.out.println("Não há multa a pagar.");
		}
		ler.close();
	}
}