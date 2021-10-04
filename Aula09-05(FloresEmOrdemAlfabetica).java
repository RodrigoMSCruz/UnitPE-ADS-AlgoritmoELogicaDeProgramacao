/******************************************************************************
Problema: Ordenar alfabeticamente os nomes de flores.

Requisitos: Como vendedor da loja de flores eu gostaria que o sistema leia o

nome de 3 flores e mostrar os nomes em ordem alfabética.

Recomendação:
• Não utilizar estrutura de repetição.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		String flor1, flor2, flor3, flor1Final, flor2Final, flor3Final;
		flor1 = "";
		flor2 = "";
		flor3 = "";
		flor1Final = "";
		flor2Final = "";
		flor3Final = "";
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("\nDigite o nome da primeira flor: ");
		flor1 = ler.nextLine();
		System.out.print("\nDigite o nome da segunda flor: ");
		flor2 = ler.nextLine();
		System.out.print("\nDigite o nome da terceira flor: ");
		flor3 = ler.nextLine();
		
		if(flor1.compareTo(flor2) < 0 && flor1.compareTo(flor3) < 0){ //Se flor1 for antes que as flores 2 e 3...
		    flor1Final = flor1;
		    if(flor2.compareTo(flor3) <0){ //Já que a flor1 é a menor, resta comparar a 2 e a 3 para saber quem é a menor.
		        flor2Final = flor2;
		        flor3Final = flor3;
		    }
		    else{                           //Se a flor2 não for menor que a 3, então é o contrário.
		        flor2Final = flor3;
		        flor3Final = flor2;
		    }//end-else
		}//end-if
		
		if(flor2.compareTo(flor1) < 0 && flor2.compareTo(flor3) < 0){ //Se flor2 for antes que as flores 1 e 3...
		    flor1Final = flor2;
		    if(flor1.compareTo(flor3) <0){ //
		        flor2Final = flor1;
		        flor3Final = flor3;
		    }
		    else{                           //Se a flor2 não for menor que a 3, então é o contrário.
		        flor2Final = flor3;
		        flor3Final = flor1;
		    }//end-else
		}//end-if
		
		if(flor3.compareTo(flor1) < 0 && flor3.compareTo(flor2) < 0){ //Se flor3 for antes que as flores 1 e 2...
		    flor1Final = flor3;
		    if(flor1.compareTo(flor2) <0){ //Já que a flor1 é a menor, resta comparar a 2 e a 3 para saber quem é a menor.
		        flor2Final = flor1;
		        flor3Final = flor2;
		    }
		    else{                           //Se a flor2 não for menor que a 3, então é o contrário.
		        flor2Final = flor2;
		        flor3Final = flor1;
		    }//end-else
		}//end-if
		System.out.println("As flores em ordem alfabética ficam:");
		System.out.println("Primeira flor: " + flor1Final + ".");
		System.out.println("Segunda flor: " + flor2Final + ".");
		System.out.println("Terceira flor: " + flor3Final + ".");
		ler.close();
	}//end-voidMain
}//end-Main
