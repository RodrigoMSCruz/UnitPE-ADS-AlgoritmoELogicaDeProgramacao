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
