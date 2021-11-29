/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		float NIVEL1 = 12.5f;
		float NIVEL2 = 25f;
		float NIVEL3 = 50f;
		float capacidadeReservatorio, tempo = 0f;
		int escolhaNivelRegulagem;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Entre com a capacidade em l do carro pipa: ");
		capacidadeReservatorio = ler.nextFloat();
		
		System.out.println("Escolha o nível de regulagem do equipamento:");
		System.out.println("Nível 1: 12,5 l/m.");
		System.out.println("Nível 2: 25   l/m.");
		System.out.println("Nível 3: 50   l/m.");
		System.out.print("\nOpção: ");
		escolhaNivelRegulagem = ler.nextInt();
		
		if(escolhaNivelRegulagem == 1){
		    tempo = capacidadeReservatorio / NIVEL1;
		}
		if(escolhaNivelRegulagem == 2){
		    tempo = capacidadeReservatorio / NIVEL2;
		}
		if(escolhaNivelRegulagem == 3){
		    tempo = capacidadeReservatorio / NIVEL3;
		}
		System.out.print("O tempo estimado para encher totalmente o caminhão pipa é: " + tempo + " minutos.");
	}//static-void
}//Main
